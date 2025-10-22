package src.twoPointers;

import static java.lang.System.*;

public final class ValidPalindrome125 {
    public final static String PALINDROME = "Malayalam";
    public final static String PALINDROME1 = "A man, a plan, a canal: Panama";
    public static void main(final String... args) {
//        out.println("Palindrome is: " + PALINDROME);
//        out.println("GOOD: " + true);
//        out.println("ACTUAL: " + isPalindrome(PALINDROME));

        out.println("Palindrome is: " + PALINDROME1);
        out.println("GOOD: " + true);
        out.println("ACTUAL: " + isPalindrome(PALINDROME1));
    }
    public static boolean isPalindrome(final String s) {
        String trimmed = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int i = 0, j = trimmed.length() -1;

        while (i < j) {

            char start = trimmed.charAt(i);
            char end = trimmed.charAt(j);

            if (start == end) {
                i++;
                j--;
            } else return false;

        }

        return true;
    }

}
