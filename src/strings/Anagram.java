package strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static String preprocess(String s) {
        // Convert to lowercase and remove spaces
        return s.toLowerCase().replaceAll("\\s+", "");
    }

    public static String sort(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c); // Optimized sorting
        return new String(c);
    }

    public static boolean checkAnagram(String f, String s) {
        String s1 = preprocess(f);
        String s2 = preprocess(s);

        if (s1.length() != s2.length()) return false; // Length check
        return sort(s1).equals(sort(s2)); // Direct string comparison
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two strings: ");
        String first = sc.nextLine();
        String second = sc.nextLine();

        if (checkAnagram(first, second)) {
            System.out.println("Strings are anagrams!");
        } else {
            System.out.println("Strings are not anagrams!");
        }

        sc.close();
    }
}
