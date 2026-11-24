class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;

        for (int i=0; i < heights.length; i++) {
            int j = heights.length-1;

            while (i < j) {
                maxArea = Math.max(maxArea, (j-i) * Math.min(heights[i], heights[j]));
                j--;
            }
        }
        return maxArea;
    }
}
