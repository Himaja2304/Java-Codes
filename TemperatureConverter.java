// TemperatureConverter.java
// Author: Himaja Akula
// Description: Converts temperature between Celsius and Fahrenheit.

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Temperature Converter ===");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose an option: ");
        int choice = sc.nextInt();

        double result;
        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                double celsius = sc.nextDouble();
                result = (celsius * 9 / 5) + 32;
                System.out.println("Temperature in Fahrenheit: " + result + "°F");
                break;
            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                double fahrenheit = sc.nextDouble();
                result = (fahrenheit - 32) * 5 / 9;
                System.out.println("Temperature in Celsius: " + result + "°C");
                break;
            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
