package com.leet.code.zalando;

import java.util.List;

class Solution1 {

    public static final List<String> ADJACENT_LETTERS = List.of("AB", "BA", "CD", "DC");

    public String solution(String string) {
        for (String adjacentLetter : ADJACENT_LETTERS) {
            string = string.replaceAll(adjacentLetter, "");
        }
        return string;
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        System.out.println(solution.solution("CBACD"));
        System.out.println(solution.solution("CBACD"));
        System.out.println();
    }

    public void solution(int N) {
        int enable_print = N % 10;
        while (N > 0) {
            if (enable_print == 0 && N % 10 != 0) {
                enable_print = 1;
            } else if (Integer.parseInt(String.valueOf(N).charAt(enable_print) + "") > 0 && enable_print >= 1) {
                System.out.print(N % 10);
            }
            N = N / 10;
            enable_print -= 1;
        }
    }
}
