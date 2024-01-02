package com.leet.code.zalando;

class Solution {

    public static final String A_A = "AA";
    public static final String A_B = "AB";
    public static final String B_B = "BB";

    public String solution(int AA, int AB, int BB) {
        if (AA == 0 && AB == 0 && BB == 0) {
            return "";
        } else if (AA == 0 && BB != 0) {
            return B_B;
        } else if (AA != 0 && BB == 0) {
            return A_A;
        } else if (AB != 0 && AA == 0 && BB == 0) {
            return A_B + solution(0, AB - 1, 0);
        } else if (AB == 0) {
            return A_A + B_B + solution(AA - 1, 0, BB - 1);
        } else {
            return A_A + B_B + A_B + solution(AA - 1, AB - 1, BB - 1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(5, 0, 2));
        System.out.println(solution.solution(1, 2, 1));
        System.out.println(solution.solution(0, 2, 0));
        System.out.println(solution.solution(0, 0, 10));
        System.out.println();
//        solution.solution(0012345);
//        System.out.println();
//        solution.solution(11001);
//        System.out.println();
//        solution.solution(352346);
//        System.out.println();
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
