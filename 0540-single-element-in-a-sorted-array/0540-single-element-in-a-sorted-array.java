class Solution {
    public int singleNonDuplicate(int[] nums) {
        int count = 0;
        int i = 0;
        while (i < nums.length - 1){
            if (nums[i] == nums[i+1]){
                i += 2;
            }
            else{
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }
}