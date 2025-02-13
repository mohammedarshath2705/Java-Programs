package strings;

import java.util.Scanner;

public class StringReverse {
    public static String reverse(String str) {
        return (str == null) ? "" : new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();
        System.out.println("Reversed: " + reverse(s));
        sc.close();
    }
}
