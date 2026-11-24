class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> sumOutput = new ArrayList<>();

        for (int i=0; i < nums.length; i++) {

            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int j = i + 1;
            int k = nums.length-1;
            int target = -nums[i];

            while(j < k) {
                if (nums[j] + nums[k] < target) {
                    j++;
                }
                else if (nums[j] + nums[k] > target) {
                    k--;
                } else {
                    sumOutput.add(Arrays.asList(nums[j], nums[i], nums[k]));
                    j++;
                    k--;
                    while(j < k && nums[j] == nums[j-1]) {
                        j++;
                    }
                }
            }

        }

        return sumOutput;


    }
}
