package basics_programs;

public class FactorialNo {

    public static long factorialRecursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        return (n == 0 || n == 1) ? 1 : n * factorialRecursive(n - 1);
    }

    public static long factorialIterative(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] testCases = {0, 1, 5, 10, 15};

        for (int testCase : testCases) {
            System.out.println("Factorial of " + testCase + " using recursion: " + factorialRecursive(testCase));
            System.out.println("Factorial of " + testCase + " using iteration: " + factorialIterative(testCase));
            System.out.println();
        }

        try {
            System.out.println("Factorial of -5: " + factorialRecursive(-5));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
