package arrays.strings;

import java.util.Arrays;

public class KRadiusSubarrayAverages {
    public int[] getAverages(int[] nums, int k) {
        long sum = 0;
        int length = nums.length;
        int[] results = new int[length];
        for (int i = 0; i < length; i++) {
            sum += nums[i];
            results[i] = -1;
            if (i - k >= k && length - (i - k) >= k) {
                results[i - k] = (int) (sum / (2 * k + 1));
                sum -= nums[i - (k * 2)];
            }
        }
        return results;
    }

    public static void main(String[] args) {
        int[] a = {7, 4, 3, 9, 1, 8, 5, 2, 6};
        int[] averages = new KRadiusSubarrayAverages().getAverages(a, 3);
        System.out.println(Arrays.toString(averages));
    }

}
