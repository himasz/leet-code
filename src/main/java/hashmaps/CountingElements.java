package hashmaps;

import java.util.Arrays;
import java.util.HashSet;

public class CountingElements {
    //https://github.com/himasz/leetcode/blob/main/solution/1400-1499/1426.Counting%20Elements/README_EN.md
    public int countElements(int[] arr) {
        int count = 0;
        HashSet<Integer> shouldExists = new HashSet<>();
        for (int num : arr) {
            if (shouldExists.contains(num)) {
                count++;
            }
            shouldExists.add(num + 1);
        }
        return count;
    }

    public static void main(String[] args) {

        CountingElements countingElements = new CountingElements();
        int[] a = {1, 2, 3};
        int[] b = {1, 1, 3, 3, 5, 5, 7, 7};
        System.out.println(Arrays.toString(a));
        System.out.println(countingElements.countElements(a));
        System.out.println(Arrays.toString(b));
        System.out.println(countingElements.countElements(b));

    }
}
