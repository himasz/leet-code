package hashmaps;

import java.util.HashMap;

public class MaximumNumberOfBalloons {
    //https://leetcode.com/problems/maximum-number-of-balloons/description/

    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] balloonArray = "balon".toCharArray();
        for (char c : balloonArray) {
            map.put(c, 0);
        }
        for (char c : text.toCharArray()) {
            if (map.get(c) != null) {
                map.put(c, map.get(c) + 1);
            }
        }
        int minDoubleLetter = Math.min(map.get('l'), map.get('o')) / 2;
        int minSignleLetter = Math.min(Math.min(map.get('b'), map.get('a')), map.get('n'));

        return Math.min(minDoubleLetter, minSignleLetter);
    }
    public int maxNumberOfBalloons_bitManipulation(String text) {
        int[] cnt = new int[26];
        for (int i = 0; i < text.length(); ++i) {
            ++cnt[text.charAt(i) - 'a'];
        }
        cnt['l' - 'a'] >>= 1;
        cnt['o' - 'a'] >>= 1;
        int ans = 1 << 30;
        for (char c : "balon".toCharArray()) {
            ans = Math.min(ans, cnt[c - 'a']);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new MaximumNumberOfBalloons().maxNumberOfBalloons("nlaebolko"));
        System.out.println(new MaximumNumberOfBalloons().maxNumberOfBalloons("loonbalxballpoon"));
        System.out.println(new MaximumNumberOfBalloons().maxNumberOfBalloons_bitManipulation("nlaebolko"));
        System.out.println(new MaximumNumberOfBalloons().maxNumberOfBalloons_bitManipulation("loonbalxballpoon"));

    }

}
