package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharsInString {
    public void findDuplicateChars(String str) {
        Map<Character, Integer> dupMap = new HashMap<>();  // Diamond operator
        char[] chrs = str.toCharArray();  // Convert string to char array

        // Count character occurrences
        for (Character ch : chrs) {
            dupMap.put(ch, dupMap.getOrDefault(ch, 0) + 1);
        }

        // Print duplicate characters
        for (Character ch : dupMap.keySet()) {
            if (dupMap.get(ch) > 1) {
                System.out.println(ch + " ---> " + dupMap.get(ch));
            }
        }
    }

    public static void main(String[] args) {
        DuplicateCharsInString dcs = new DuplicateCharsInString();
        dcs.findDuplicateChars("Java2Novice");
    }
}
