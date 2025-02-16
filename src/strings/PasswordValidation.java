package strings;

import java.util.Scanner;

public class PasswordValidation {
    static final String SPECIAL_CHARACTERS = "!#$%^&*|";  // Removed ',' for correct matching

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Password: ");
        String password = sc.nextLine();
        sc.close();

        if (isValidPassword(password)) {
            System.out.println("Password is in correct format!");
        } else {
            System.out.println("Not a valid password!");
        }
    }

    public static boolean isValidPassword(String pass) {
        boolean loCase = false;
        int digitCount = 0;
        boolean spChar = false;

        if (pass.length() < 8) {  // Password should be at least 8 characters
            return false;
        }

        for (char ch : pass.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                loCase = true;
            }
            if (Character.isDigit(ch)) {
                digitCount++;
            }
            if (SPECIAL_CHARACTERS.contains(String.valueOf(ch))) {
                spChar = true;
            }
        }

        // The password must contain at least one lowercase letter, two digits, and one special character.
        return loCase && (digitCount >= 2) && spChar;
    }
}
