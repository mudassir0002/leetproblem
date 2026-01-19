class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int sec = 0;
        for(int i=1 ; i <points.length ; i++){
            int s1 = Math.abs(points[i-1][0] - points[i][0]);
            int s2 = Math.abs(points[i-1][1] - points[i][1]);
            sec += Math.max(s1,s2);
        }
        return sec;
    }
}