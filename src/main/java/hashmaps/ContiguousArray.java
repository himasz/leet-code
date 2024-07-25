package hashmaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(0, -1);
        int s = 0, ans = 0;
        for (int i = 0; i < nums.length; ++i) {
            s += nums[i] == 1 ? 1 : -1;
            if (mp.containsKey(s)) {
                ans = Math.max(ans, i - mp.get(s));
            } else {
                mp.put(s, i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
//        int[] a = {0, 1};
//        System.out.println(Arrays.toString(a));
//        System.out.println(new ContiguousArray().findMaxLength(a));
//
//        int[] b = {0, 1, 0};
//        System.out.println(Arrays.toString(b));
//        System.out.println(new ContiguousArray().findMaxLength(b));

        int[] c = {0, 0, 1, 0, 0, 0, 1, 1};
        System.out.println(Arrays.toString(c));
        System.out.println(new ContiguousArray().findMaxLength(c));
    }

    public int findMaxLength_2(int[] nums) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum != 0 && sum == (i + 1) / 2) {
                max = i + 1;
            }
        }
        return max;
    }


    public int findMaxLength_1(int[] nums) {
        Pair[] sums = new Pair[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sums[i] = new Pair();
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <= i; j++) {
                Pair sum = sums[j];
                if (nums[i] == 1) {
                    sum.onesNum++;
                } else {
                    sum.zeroesNum++;
                }
                if (sum.onesNum == sum.zeroesNum) {
                    sum.count = sum.onesNum * 2;
                }

            }
        }
        int max = 0;
        for (Pair sum : sums) {
            int count = sum.count;
            if (max < count) {
                max = count;
            }
        }
        return max;
    }
    class Pair {
        private int onesNum;
        private int zeroesNum;

        private int count;
        public Pair() {
            this.onesNum = 0;
            this.zeroesNum = 0;
        }

    }
}
