class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int i = 0;
        
        while(i < n) {

            if (numbers[i] + numbers[n-1] > target) {
                n--;
            }
            else if (numbers[i] + numbers[n-1] < target) {
                i++;
            }
            else {
                return new int[] {i+1, n};
            }
        }
        return new int[0];
    }
}
