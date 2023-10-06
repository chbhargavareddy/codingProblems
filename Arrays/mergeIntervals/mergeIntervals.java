package mergeIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


class Solution {
    public int[][] merge(int[][] intervals) {

        //Checking the length of the intervals IF it is one return 1
        if(intervals.length == 1) return intervals;

        //Sorting based on the array first element 
        Arrays.sort( intervals , Comparator.comparingInt(a -> a[0]));

        //Taking the responses in to an Arraylist of type integer  
        List<int[]> response = new ArrayList<>();

        //Adding first elemenrt into the new INterval List
        int[] newInterval = intervals[0];
        // Adding the values into the Response List
        response.add(newInterval);

        //Iterating through the intervals
        for ( int[] interval : intervals) {
            
            if ( interval[0] <= newInterval[1]) {
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            } else {
                newInterval = interval;
                response.add(newInterval);
            }

        }

        return response.toArray(new int[response.size()][]); 
    }
}