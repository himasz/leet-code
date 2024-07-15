package arrays.strings;

public class MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        int j = 0;
        int maxAverage = 0;
        while (j < k) {
            maxAverage += nums[j];
            j++;
        }
        for (int i = 0; i < nums.length & j < nums.length; i++) {
            int newMaxAverage = maxAverage - nums[i] + nums[j];
            if (newMaxAverage > maxAverage) {
                maxAverage = newMaxAverage;
            }
            j++;
        }
        return (double) maxAverage / k;
    }

    public static void main(String[] args) {
        System.out.println(new MaximumAverageSubarrayI().findMaxAverage(new int[]{5}, 1));
        System.out.println(new MaximumAverageSubarrayI().findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));
        System.out.println(new MaximumAverageSubarrayI().findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));
    }
}
