package hashmaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LargestUniqueNumber {
    //https://github.com/himasz/leetcode/blob/main/solution/1100-1199/1133.Largest%20Unique%20Number/README_EN.md
    public int largestUniqueNumber(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        int largestUnique = -1;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                largestUnique = Math.max(largestUnique, entry.getKey());
            }
        }
        return largestUnique;
    }

    public static int largestUniqueNumber_array(int[] nums) {
        int[] numsCount = new int[1001];
        for (int num : nums) {
            numsCount[num] += 1;
        }
        int unique = -1;
        for (int num : nums) {
            if (numsCount[num] == 1 && unique < num) {
                unique = num;
            }
        }
        return unique;
    }

    public static void main(String[] args) {
        int[] a = {5, 7, 3, 9, 4, 9, 8, 3, 1};
        int[] b = {9, 9, 8, 8};
        LargestUniqueNumber sol = new LargestUniqueNumber();
        System.out.println(Arrays.toString(a));
        System.out.println(sol.largestUniqueNumber(a));

        System.out.println(Arrays.toString(b));
        System.out.println(sol.largestUniqueNumber(b));
    }
}
