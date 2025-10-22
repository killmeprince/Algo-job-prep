package src.twoPointers;

/*
* Ввод: числа = [ 2 , 7 , 11, 15], цель = 9
  Вывод: [1, 2]
  Объяснение: Сумма 2 и 7 равна 9. Следовательно, индекс 1 = 1, индекс 2 = 2. Мы возвращаем [1, 2].
 * */
public class Solution {
    public static final int[] INPUT = new int[]{2, 7, 11, 15};
    public static final int TARGET = 9;

    public static void main(String[] args) {
        System.out.println("Test 1: ");
        System.out.println("GOOD: [1, 2]");
        int[] func = twoSum(INPUT, TARGET);
        System.out.println("ACTUAL: " + "[" + func[0] + ", " + func[1] + "]");

    }

    public static int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            if (numbers[i] + numbers[j] == target) {
                return new int[]{i + 1, j + 1};
            } else if (numbers[i] + numbers[j] < target) i++;
            else j--;
        }
        return new int[]{};
    }

    public int[] twoSu1m(int[] numbers, int target) {
        if (numbers == null) return new int[]{};
        int i = 0, j = numbers.length - 1;

        while (i < j) {
            if (numbers[i] + numbers[j] == target) {
                return new int[]{i + 1, j + 1};
            } else if (numbers[i] + numbers[j] < target) {
                i++;
            } else j--;
        }
        return new int[]{};
    }
}
