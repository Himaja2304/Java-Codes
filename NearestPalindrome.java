// NearestPalindrome.java
// Author: Himaja Sai Suvarchala
// Description: A program to find the nearest palindromic number for a given integer input.

import java.util.Scanner;

public class NearestPalindrome {

    // Function to check if a number is palindrome
    public static boolean isPalindrome(long num) {
        String str = Long.toString(num);
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    // Function to find nearest palindrome
    public static long nearestPalindrome(long n) {
        if (isPalindrome(n)) return n;

        long lower = n - 1;
        long upper = n + 1;

        while (true) {
            if (isPalindrome(lower)) return lower;
            if (isPalindrome(upper)) return upper;
            lower--;
            upper++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Nearest Palindrome Finder ===");
        System.out.print("Enter a number: ");
        long n = sc.nextLong();

        long nearest = nearestPalindrome(n);
        System.out.println("The nearest palindrome to " + n + " is: " + nearest);

        sc.close();
    }
}
