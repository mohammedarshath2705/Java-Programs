package basics_programs;

import java.util.Scanner;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year to check if it is a leap year: ");
        int year = scanner.nextInt();
        System.out.println("Year " + year + " is a leap year: " + isLeapYear(year));
        scanner.close();
    }
}
