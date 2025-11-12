// StudentGradeCalculator.java
// Author: Himaja Akula
// Description: Calculates average marks and assigns a grade based on total percentage.

import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Student Grade Calculator ===");
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        double total = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            total += sc.nextDouble();
        }

        double percentage = total / n;
        System.out.println("\nAverage Percentage: " + percentage + "%");

        char grade;
        if (percentage >= 90) grade = 'A';
        else if (percentage >= 75) grade = 'B';
        else if (percentage >= 60) grade = 'C';
        else if (percentage >= 40) grade = 'D';
        else grade = 'F';

        System.out.println("Grade: " + grade);
        sc.close();
    }
}
