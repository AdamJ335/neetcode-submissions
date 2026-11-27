class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int midpos=(low+high)/2;
            int midnum=nums[midpos];
            if(midnum==target){
                return midpos;
            }
            if(midnum<target){
                low=midpos+1;
            }
            else{
                high=midpos-1;
            }
        }
        return -1;
    }
}
