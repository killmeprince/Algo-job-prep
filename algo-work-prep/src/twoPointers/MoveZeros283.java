package src.twoPointers;

import static java.lang.System.in;
import static java.lang.System.out;

/**
 * Example 1:
 *
 * Input: nums = [0,1,0,3,12]
 * 1 iteration: [12,1,0,3,0]
 * 2 iteration: [12,1,0,3,0]
 * Output: [1,3,12,0,0]
 * Example 2:
 *
 * Input: nums = [0]
 * Output: [0]
 */

public final class MoveZeros283 {
    public static final int[] INPUT_1 = new int[] {0,1,0,3,12};
    public static void main(final String... args) {
        out.print("Input: ");
        out.print("[");
        for (int i = 0; i < INPUT_1.length; i++) {
            out.print(INPUT_1[i] +",");
        }
        out.print("]");
        out.print("\n");
        out.println("GOOD: [1,3,12,0,0]");
        moveZeroes(INPUT_1);
        out.print("ACTUAL: " );
        out.print("[");
        for (int i = 0; i < INPUT_1.length; i++) {
            out.print(INPUT_1[i] +",");
        }
        out.print("]");

    }
    public static void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length ; i++) {
            for (int j = i; j < nums.length ; j++) {
                if (nums[i] == 0 && nums[j] != 0) {

                    nums[i] = nums[j];
                    nums[j] = 0;
                }
            }
        }
    }
}
