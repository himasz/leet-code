package com.leet.code.examples.zalando;

class SolutionA {

    public void solution(Integer N) {
        int enable_print =  N % 10;
        while (N > 0) {
            if (enable_print == 0 && N % 10 != 0) {
                enable_print = 1;
            }
             if (enable_print == 1) {
                System.out.print(N % 10);
            }
            N = N / 10;
        }
    }

    public static void main(String[] args) {
        SolutionA solution = new SolutionA();
        System.out.println();
        solution.solution( 12400 );
        System.out.println();
        solution.solution(54321);
        System.out.println();
        solution.solution(11001);
        System.out.println();
        solution.solution(352346);
        System.out.println();
    }
}
