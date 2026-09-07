import java.util.*;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {

        // Sort intervals based on starting number
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        ArrayList<int[]> result = new ArrayList<>();

        // Take first interval
        int start = intervals[0][0];
        int end = intervals[0][1];

        // Check remaining intervals
        for (int i = 1; i < intervals.length; i++) {

            // If overlapping
            if (end >= intervals[i][0]) {

                end = Math.max(end, intervals[i][1]);
            }

            // If not overlapping
            else {

                result.add(new int[]{start, end});

                start = intervals[i][0];
                end = intervals[i][1];
            }
        }

        // Add last interval
        result.add(new int[]{start, end});

        //return result.toArray(new int[result.size()][]);  for loop eh thevai ila 
  
        int [][] merge=new int[result.size()][2];

        for(int i=0;i<result.size();i++){
            merge[i][0]=result.get(i)[0];
            merge[i][1]=result.get(i)[1];
        }
        return merge;

        
    }

    public static void main(String[] args) {

        int[][] intervals = {
            {1, 3},
            {2, 6},
            {8, 10},
            {15, 18}
        };

        int[][] result = merge(intervals);

        for (int[] interval : result) {
            System.out.println(
                "[" + interval[0] + ", " + interval[1] + "]"
            );
        }
    }
}