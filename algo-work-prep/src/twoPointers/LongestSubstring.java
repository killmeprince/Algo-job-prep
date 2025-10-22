package src.twoPointers;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
/*
Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) return 0;

        int l = 0;
        int ans = 0;
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Integer idx = map.getOrDefault(c, -1);

            if (idx >= 1){
                l = idx + 1;

            }
            ans = Math.max(ans, i - l + 1);
            map.put(c,i);

        }

        return ans;
    }
}
