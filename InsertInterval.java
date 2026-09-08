import java.util.*;

public class InsertInterval {

    public static int[][] insert(int[][] intervals, int[] newInterval) {

        ArrayList<int[]> list = new ArrayList<>();

        // Add all existing intervals
        for (int i = 0; i < intervals.length; i++) {
            list.add(intervals[i]);
        }

        // Add new interval
        list.add(newInterval);

        // Sort based on starting value
        list.sort((a, b) -> a[0] - b[0]);

        int starting = list.get(0)[0];
        int ending = list.get(0)[1];

        ArrayList<int[]> result = new ArrayList<>();

        // Merge intervals
        for (int i = 1; i < list.size(); i++) {

            if (ending >= list.get(i)[0]) {
                ending = Math.max(ending, list.get(i)[1]);
            }
            else {
                result.add(new int[]{starting, ending});

                starting = list.get(i)[0];
                ending = list.get(i)[1];
            }
        }

        // Add last interval
        result.add(new int[]{starting, ending});

        // Convert ArrayList to 2D array
        int[][] merge = new int[result.size()][2];

        for (int i = 0; i < result.size(); i++) {
            merge[i][0] = result.get(i)[0];
            merge[i][1] = result.get(i)[1];
        }

        return merge;
    }

    public static void main(String[] args) {

        int[][] intervals = {
            {1, 3},
            {6, 9}
        };

        int[] newInterval = {2, 5};

        int[][] answer = insert(intervals, newInterval);

        for (int i = 0; i < answer.length; i++) {
            System.out.println(
                "[" + answer[i][0] + ", " + answer[i][1] + "]"
            );
        }
    }
}