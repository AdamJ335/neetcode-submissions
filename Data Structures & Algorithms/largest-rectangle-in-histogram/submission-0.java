class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;
        // create stack of indices 
        // top stack is vertical bar
        // horizontal is finding boundaries of stack
        for (int i=0; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] > heights[i]) {
                int idx = stack.pop();
                int h = heights[idx];
                int leftBound = stack.isEmpty() ? - 1: stack.peek();
                int width = i - leftBound - 1;
                maxArea = Math.max(maxArea, h*width);
                
            }
            stack.push(i);
            
        }
        while(!stack.isEmpty()) {
            int idx = stack.pop();
            int h = heights[idx];
            int leftBound = stack.isEmpty() ? -1 : stack.peek();
            int width = n - leftBound - 1;
            maxArea = Math.max(maxArea, h * width);
        }
        return maxArea;
        
    }
}
