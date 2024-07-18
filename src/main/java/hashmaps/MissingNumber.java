package hashmaps;

import java.util.Arrays;

public class MissingNumber {
    //https://leetcode.com/problems/missing-number/description/
    public int missingNumber(int[] nums) {
        int answer = nums.length;
        for (int i = 0; i < nums.length; i++) {
            //xor operator!
            answer ^= (i ^ nums[i]);
        }
        return answer;
    }

    public int missingNumber_equation(int[] nums) {
        int answer = nums.length;
        for (int i = 0; i < nums.length; i++) {
            answer += (i - nums[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        MissingNumber sol = new MissingNumber();

        int[] a = {3, 0, 1};
        int[] b = {0, 1};
        int[] c = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(Arrays.toString(a));
        System.out.println(sol.missingNumber(a));
        System.out.println(sol.missingNumber_equation(a));
        System.out.println(Arrays.toString(b));
        System.out.println(sol.missingNumber(b));
        System.out.println(sol.missingNumber_equation(b));
        System.out.println(Arrays.toString(c));
        System.out.println(sol.missingNumber(c));
        System.out.println(sol.missingNumber_equation(c));
    }
}
