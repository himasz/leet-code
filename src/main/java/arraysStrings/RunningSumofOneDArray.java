package arrays.strings;

public class RunningSumofOneDArray {
    //https://leetcode.com/problems/max-consecutive-ones-iii/description/
    public int[] runningSum(int[] nums) {
        int sum = 0;
        int[] results = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            results[i] = sum;
        }
        return results;
    }

}
