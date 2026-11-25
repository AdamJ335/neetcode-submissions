class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<int[]> stk = new Stack<>(); // stack pair

        for(int i = 0; i < temperatures.length; i++) {
            int t = temperatures[i];
            while (!stk.isEmpty() && t > stk.peek()[0]) {
                // update to difference of days
                int[] pair = stk.pop();
                res[pair[1]] = i - pair[1]; 
            }
            stk.push(new int[]{t, i});
        }
        return res;
    }
}
