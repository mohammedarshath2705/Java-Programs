package MathProgram;

import java.util.Scanner;

public class PascalTriangle {
    public static void pascal(int n) {
        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int spaces = 0; spaces < n - i - 1; spaces++)
                System.out.print(" ");

            int num = 1;  // First number in each row is always 1
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1); // Compute next value using binomial coefficient formula
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int n = sc.nextInt();
        pascal(n);
        sc.close();
    }
}
