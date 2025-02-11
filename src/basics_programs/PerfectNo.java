package basics_programs;

import java.util.Scanner;

public class PerfectNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        long n = in.nextLong(); // Fix: Using nextLong() instead of nextInt()

        for (int i = 2; i <= n; i++) {  // Fix: Changed `<` to `<=` to include n
            if (isNumPerfect(i)) {
                System.out.println(i + " is a perfect number");
            }
        }
        in.close();
    }

    public static boolean isNumPerfect(int num) {
        int sum = 1; // 1 is always a divisor
        for (int x = 2; x * x <= num; x++) { // Efficient divisor sum calculation
            if (num % x == 0) {
                sum += x;
                if (x != num / x) {
                    sum += num / x;
                }
            }
        }
        return sum == num;
    }
}
