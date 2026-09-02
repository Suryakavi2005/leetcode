// Last updated: 9/2/2026, 1:44:27 PM
1import java.util.*;
2
3class Solution {
4    public int findMinArrowShots(int[][] points) {
5        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
6
7        int arrows = 1;
8        int arrowPosition = points[0][1];
9
10        for (int i = 1; i < points.length; i++) {
11            if (points[i][0] > arrowPosition) {
12                arrows++;
13                arrowPosition = points[i][1];
14            }
15        }
16
17        return arrows;
18    }
19}