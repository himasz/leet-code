package com.leet.code.examples.zalando;

import java.util.List;

class Solutionaa {

    public static List<String> ADJACENT_LETTERS = List.of("AB", "BA", "CD", "DC");

    public String solution(String string) {
        for (String adjacentLetter : ADJACENT_LETTERS) {
            if (string.contains(adjacentLetter)) {
                return solution(string.replace(adjacentLetter, ""));
            }
        }
        return string;
    }

    public static void main(String[] args) {
        Solutionaa solution = new Solutionaa();
        System.out.println(solution.solution("CBACD"));
        System.out.println(solution.solution("CABABD"));
        System.out.println(solution.solution("ACBDACBD"));

    }
}
