package arrays.strings;

import java.util.Arrays;

public class MinimumValueToGetPositiveStepbyStepSum {
    //https://leetcode.com/problems/minimum-value-to-get-positive-step-by-step-sum/description/
    public int minStartValue(int[] nums) {
        int sum = 0;
        int minimum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum < 1 && (minimum + sum) < 1) {
                minimum += ((minimum + sum) * -1);
            }
        }
        return minimum + 1;
    }

    public int minStartValue_solutions(int[] nums) {
        int s = 0;
        int t = Integer.MAX_VALUE;
        for (int num : nums) {
            s += num;
            t = Math.min(t, s);
        }
        return Math.max(1, 1 - t);
    }

    public static void main(String[] args) {
        int[] a = {-3, 2, -3, 4, 2};
        int[] b = {1, 2};
        int[] c = {1, -2, -3};
        System.out.println(Arrays.toString(a));
        System.out.println(new MinimumValueToGetPositiveStepbyStepSum().minStartValue(a));
        System.out.println(Arrays.toString(b));
        System.out.println(new MinimumValueToGetPositiveStepbyStepSum().minStartValue(b));
        System.out.println(Arrays.toString(c));
        System.out.println(new MinimumValueToGetPositiveStepbyStepSum().minStartValue(c));

    }
}
