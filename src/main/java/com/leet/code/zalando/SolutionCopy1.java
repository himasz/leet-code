package com.leet.code.zalando;

import java.util.Arrays;

class SolutionCopy1 {

    public int solution(int[] A) {
        Arrays.sort(A);
        int smallestPositive = 1;
        for (int element : A) {
            if (element > 0 &&  smallestPositive >= element) {
                smallestPositive = element + 1;
            }
        }
        return smallestPositive;
    }

    //Combine 2 days together and loop over E to get the largest !
    public static void main(String[] args) {
        SolutionCopy1 solution = new SolutionCopy1();
        System.out.println(solution.solution(new int[]{1, 3, 6, 4, 1, 2}));
        System.out.println(solution.solution(new int[]{1, 2, 3}));
        System.out.println(solution.solution(new int[]{-1, -3}));
    }
}
