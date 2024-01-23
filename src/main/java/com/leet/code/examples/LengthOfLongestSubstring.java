package com.leet.code.examples;

import java.util.HashMap;

public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if (s == null)
            return 0;
        if (s.equals(" "))
            return 1;

        int largest = 0;
        int localLargest = 0;
        HashMap<Character, Integer> chars = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            if (chars.containsKey(key)) {
                localLargest = chars.get(key);
                chars = new HashMap<>();
            }
            chars.put(key, -1);
            for (Character keyMap : chars.keySet()) {
                chars.put(keyMap, chars.get(keyMap) + 1);
            }
            localLargest += 1;
            if (localLargest > largest) {
                largest = localLargest;
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        LengthOfLongestSubstring solution = new LengthOfLongestSubstring();
        System.out.println(solution.lengthOfLongestSubstring("dvdf"));
        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));
        System.out.println(solution.lengthOfLongestSubstring(" "));
    }
}
