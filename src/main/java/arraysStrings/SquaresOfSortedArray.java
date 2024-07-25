package arrays.strings;

import java.util.Arrays;

public class SquaresOfSortedArray {
    //https://leetcode.com/problems/squares-of-a-sorted-array/description/
    public int[] sortedSquares(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int k = nums.length - 1;
        int[] results = new int[nums.length];
        while (j >= i) {
            int ith = nums[i];
            int jth = nums[j];
            if (ith * ith > jth * jth) {
                results[k] = ith * ith;
                i++;
            } else {
                results[k] = jth * jth;
                j--;
            }
            k--;
        }
        return results;
    }

    public static void main(String[] args) {
        int[] s = {-7, -3, 2, 3, 11};
        System.out.println(Arrays.toString(s));
        System.out.println(Arrays.toString(new SquaresOfSortedArray().sortedSquares(s)));
    }
}
