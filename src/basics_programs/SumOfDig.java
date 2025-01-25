package basics_programs;

import java.util.Scanner;

public class SumOfDig {
    public int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        SumOfDig obj = new SumOfDig();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of test cases:");
        int testCases = sc.nextInt();
        for (int i = 0; i < testCases; i++) {
            System.out.println("Enter a number:");
            int number = sc.nextInt();
            System.out.println("Sum of digits: " + obj.sumOfDigits(number));
        }
        sc.close();
    }
}
