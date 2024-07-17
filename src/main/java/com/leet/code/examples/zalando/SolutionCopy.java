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

    //chatGPT solution
    public int largestCommonAvailability(String[] E) {
        // Step 1: Create a map to store which employees are available on each day
        Map<Integer, Set<Integer>> dayToEmployees = new HashMap<>();
        for (int day = 0; day < 10; day++) {
            dayToEmployees.put(day, new HashSet<>());
        }

        for (int employee = 0; employee < E.length; employee++) {
            String availability = E[employee];
            for (char c : availability.toCharArray()) {
                int day = c - '0';
                dayToEmployees.get(day).add(employee);
            }
        }

        // Step 2: Iterate over all pairs of days and count common employees
        int largest = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                Set<Integer> employeesDayI = dayToEmployees.get(i);
                Set<Integer> employeesDayJ = dayToEmployees.get(j);

                // Find intersection of sets
                Set<Integer> commonEmployees = new HashSet<>(employeesDayI);
                commonEmployees.retainAll(employeesDayJ);

                // Step 3: Track the maximum count
                largest = Math.max(largest, commonEmployees.size());
            }
        }

        return largest;
    }


    //Combine 2 days together and loop over E to get the largest !
    public static void main(String[] args) {
        SolutionCopy solution = new SolutionCopy();
        System.out.println(solution.solution(new String[]{"039", "4", "14", "32", "", "34", "7"}));
        System.out.println(solution.largestCommonAvailability(new String[]{"039", "4", "14", "32", "", "34", "7"}));

        System.out.println(solution.solution(new String[]{"801234567", "180234567", "0", "189234567", "891234567", "98", "9"}));
        System.out.println(solution.largestCommonAvailability(new String[]{"801234567", "180234567", "0", "189234567", "891234567", "98", "9"}));

        System.out.println(solution.solution(new String[]{"5421", "245", "1452", "0345", "53", "354"}));
        System.out.println(solution.largestCommonAvailability(new String[]{"5421", "245", "1452", "0345", "53", "354"}));

        System.out.println("___");
        System.out.println(solution.newSolution(new String[]{"039", "4", "14", "32", "", "34", "7"}));
        System.out.println(solution.largestCommonAvailability(new String[]{"039", "4", "14", "32", "", "34", "7"}));

        System.out.println(solution.newSolution(new String[]{"801234567", "180234567", "0", "189234567", "891234567", "98", "9"}));
        System.out.println(solution.largestCommonAvailability(new String[]{"801234567", "180234567", "0", "189234567", "891234567", "98", "9"}));

        System.out.println(solution.newSolution(new String[]{"5421", "245", "1452", "0345", "53", "354"}));
        System.out.println(solution.largestCommonAvailability(new String[]{"5421", "245", "1452", "0345", "53", "354"}));

        /*
         * Given an array of strings where each string represents the days an employee is available (0-9),
         * determine the largest number of employees available on at least two common days.
         */
    }
}
