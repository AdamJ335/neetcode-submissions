class Solution {
    public int search(int[] nums, int target) {
        int index = 0;
        int range = nums.length-1;
        while (index <= range) {
            int m = index + ((range - index)/2);
            int middleVal = nums[m];
            if (middleVal > target) {
                range = m - 1;
            } else if (middleVal < target) {
                index = m + 1;
            } else {
                return m;
            }
        }
        return -1;
    }
}
