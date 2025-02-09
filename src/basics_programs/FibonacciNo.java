package basics_programs;

import java.util.Scanner;

public class FibonacciNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();  // Close the scanner after input

        int a = 0, b = 1, res;
        System.out.println("Fibonacci series:");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            res = a + b;
            a = b;
            b = res;
        }
    }
}
