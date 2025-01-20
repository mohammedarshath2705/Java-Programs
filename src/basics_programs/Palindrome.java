package basics_programs;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindrome(int num) {
        if (num < 0) {
            return false;
        }

        int original = num;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        System.out.println("String Palindrome Tests:");
        System.out.println("madam is a palindrome: " + isPalindrome("madam"));
        System.out.println("hello is a palindrome: " + isPalindrome("hello"));
        System.out.println("racecar is a palindrome: " + isPalindrome("racecar"));
        System.out.println("Java is a palindrome: " + isPalindrome("Java"));

        System.out.println("\nNumber Palindrome Tests:");
        System.out.println("121 is a palindrome: " + isPalindrome(121));
        System.out.println("-121 is a palindrome: " + isPalindrome(-121));
        System.out.println("12321 is a palindrome: " + isPalindrome(12321));
        System.out.println("12345 is a palindrome: " + isPalindrome(12345));
    }
}
