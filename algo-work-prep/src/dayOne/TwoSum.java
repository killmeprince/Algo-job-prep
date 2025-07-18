package src.dayOne;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 *
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int [] badResult ={};
//        (o)n^2
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    return new int[] {i, j};
//                }
//            }
//        }
//        return badResult;
//        (0)n
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int t = target-nums[i];
            if (map.containsKey(t)) {
                return new int[] {map.get(t),i};
            }
            map.put(nums[i], i);
        }
        return badResult;
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
//        int[]nums = {2,7,11,15};
        int[]nums ={4,7,9};
        int output = 16;
        System.out.println(Arrays.toString(twoSum.twoSum(nums, output)));

    }
}
