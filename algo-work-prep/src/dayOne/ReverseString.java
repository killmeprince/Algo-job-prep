package src.dayOne;

import java.util.Arrays;

public class ReverseString {
    public void reverseString(char[] s) {
//        StringBuilder stringBuilder = new StringBuilder();
//        int end = s.length - 1;
////        System.out.println(end);
//        for (int i = end; i >= 0; i--) {
//            stringBuilder.append(s[i]);
//        }
//        String result = stringBuilder.toString();
//        char[] res = result.toCharArray();
//
//        System.out.println(Arrays.toString(res));

        int left = 0, right = s.length -1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
//        char[] s = {'a','p','p'};
        char[] s = {'a','p','p'};
        reverseString.reverseString(s);
    }
}
