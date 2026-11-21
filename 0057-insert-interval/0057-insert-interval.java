import java.util.*;

class Solution {

    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> list = new ArrayList<>();

        for (int[] arr : intervals) {
            list.add(arr);
        }

        list.add(newInterval);

        return merge(list.toArray(new int[list.size()][]));
    }


    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();

        int s1 = intervals[0][0];
        int e1 = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {

            int s2 = intervals[i][0];
            int e2 = intervals[i][1];

            if (e1 >= s2) {

                e1 = Math.max(e1, e2);

            } else {

                result.add(new int[]{s1, e1});

                s1 = s2;
                e1 = e2;
            }
        }

        result.add(new int[]{s1, e1});

        return result.toArray(new int[result.size()][]);
    }
}