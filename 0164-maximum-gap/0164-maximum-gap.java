class Solution {
    public int maximumGap(int[] nums) {   // complexity is not linear
        int space = 0;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++){
            if (Math.abs(nums[i] - nums[i - 1]) > space){
                space = Math.abs(nums[i] - nums[i - 1]);
            }
        }
        return space;
    }
}