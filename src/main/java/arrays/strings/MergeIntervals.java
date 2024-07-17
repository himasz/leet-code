package arrays.strings;

import java.util.*;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][];

        // Step 1: Sort the intervals by their start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // Step 2: Use a list to store the merged intervals
        List<int[]> merged = new ArrayList<>();

        // Step 3: Initialize the first interval as the current interval to compare with others
        int[] currentInterval = intervals[0];
        merged.add(currentInterval);

        // Step 4: Iterate through the intervals
        for (int[] interval : intervals) {
            int currentStart = currentInterval[0];
            int currentEnd = currentInterval[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];

            // Step 5: Check if intervals overlap
            if (currentEnd >= nextStart) {
                // Merge intervals
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                // No overlap, add the next interval as a new entry
                currentInterval = interval;
                merged.add(currentInterval);
            }
        }

        // Step 6: Convert the list to an array and return
        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        int[][] meetings = {{1, 3}, {8, 10}, {15, 18}, {2, 6}};
        int[][] mergedMeetings = merge(meetings);

        // Print the result
        System.out.println("Merged Intervals:");
        for (int[] interval : mergedMeetings) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
