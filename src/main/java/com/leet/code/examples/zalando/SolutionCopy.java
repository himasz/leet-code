package com.leet.code.examples.zalando;

import java.util.*;

class SolutionCopy {

    public int newSolution(String[] E) {
        int largest = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int localLargest = 0;
                for (String employee : E) {
                    if (employee.contains(String.valueOf(i)) && employee.contains(String.valueOf(j))) {
                        localLargest += 1;
                    }
                }
                if (localLargest > largest) {
                    largest = localLargest;
                }
            }
        }
        return largest;
    }

    public int solution(String[] E) {
        HashMap<Integer, List<Integer>> availability = new HashMap<>();
        for (int daysIterator = 0; daysIterator < 10; daysIterator++) {
            for (int employeeIterator = 0; employeeIterator < E.length; employeeIterator++) {
                if (E[employeeIterator].contains(String.valueOf(daysIterator))) {
                    List<Integer> list = availability.getOrDefault(daysIterator, new ArrayList<>());
                    list.add(employeeIterator);
                    availability.put(daysIterator, list);
                }
            }
        }
        int largest = 0;
        for (List<Integer> firstList : availability.values()) {
            for (List<Integer> secondList : availability.values()) {
                Set<Integer> employees = new HashSet<>();
                employees.addAll(firstList);
                employees.addAll(secondList);
                if (employees.size() > largest) {
                    largest = employees.size();
                }
            }
        }
        return largest;
    }

    //Combine 2 days together and loop over E to get the largest !
    public static void main(String[] args) {
        SolutionCopy solution = new SolutionCopy();
        System.out.println(solution.solution(new String[]{"039", "4", "14", "32", "", "34", "7"}));
        System.out.println(solution.solution(new String[]{"801234567", "180234567", "0", "189234567", "891234567", "98", "9"}));
        System.out.println(solution.solution(new String[]{"5421", "245", "1452", "0345", "53", "354"}));
        System.out.println("___");
        System.out.println(solution.newSolution(new String[]{"039", "4", "14", "32", "", "34", "7"}));
        System.out.println(solution.newSolution(new String[]{"801234567", "180234567", "0", "189234567", "891234567", "98", "9"}));
        System.out.println(solution.newSolution(new String[]{"5421", "245", "1452", "0345", "53", "354"}));
    }
}
