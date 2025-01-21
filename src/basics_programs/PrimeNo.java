package basics_programs;

public class PrimeNo {

    public boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        PrimeNo primeChecker = new PrimeNo();

        System.out.println("2 is prime: " + primeChecker.isPrime(2));
        System.out.println("3 is prime: " + primeChecker.isPrime(3));
        System.out.println("4 is prime: " + primeChecker.isPrime(4));
        System.out.println("17 is prime: " + primeChecker.isPrime(17));
        System.out.println("20 is prime: " + primeChecker.isPrime(20));
        System.out.println("-5 is prime: " + primeChecker.isPrime(-5));
        System.out.println("1 is prime: " + primeChecker.isPrime(1));
        System.out.println("0 is prime: " + primeChecker.isPrime(0));
        System.out.println("97 is prime: " + primeChecker.isPrime(97));
    }
}
