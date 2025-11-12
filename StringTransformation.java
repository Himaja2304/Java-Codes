// StringTransformation.java
// Author: Himaja Akula
// Description: 
// This program determines the minimum number of operations required to transform 
// string A into string B, given specific transformation rules.
// Each operation allows converting a subset of characters in A into a smaller character lexicographically.

import java.util.*;

public class StringTransformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine().trim());
        String A = sc.nextLine().trim();
        String B = sc.nextLine().trim();

        // Basic checks
        if (A.length() != N || B.length() != N) {
            System.out.println(-1);
            return;
        }

        // Feasibility check: B[i] must not be lexicographically greater than A[i]
        for (int i = 0; i < N; i++) {
            if (B.charAt(i) > A.charAt(i)) {
                System.out.println(-1);
                return;
            }
        }

        char[] a = A.toCharArray();
        int ops = 0;

        // Process characters from 'z' to 'a'
        for (char c = 'z'; c >= 'a'; c--) {
            // Collect indices that need to become 'c'
            List<Integer> need = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                if (B.charAt(i) == c && a[i] > c) {
                    need.add(i);
                }
            }

            if (need.isEmpty()) continue; // no change needed for this letter

            // Find an index where a[i] == c to act as a seed
            int seedIndex = -1;
            for (int i = 0; i < N; i++) {
                if (a[i] == c) {
                    seedIndex = i;
                    break;
                }
            }

            // If no seed exists, transformation is impossible
            if (seedIndex == -1) {
                System.out.println(-1);
                return;
            }

            // Perform one operation (convert all needed indices to 'c')
            for (int idx : need) {
                a[idx] = c;
            }

            ops++; // one operation performed
        }

        // Final verification
        if (!new String(a).equals(B)) {
            System.out.println(-1);
        } else {
            System.out.println(ops);
        }

        sc.close();
    }
}
