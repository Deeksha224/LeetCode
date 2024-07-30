class Solution {
    public int majorityElement(int[] nums) {
        int max = 0, count  = 0, ans = 0;
        Arrays.sort(nums);
        if (nums.length == 1){
            return nums[0];
        }
        for (int i = 0; i < nums.length - 1; i++){
            if (nums[i] == nums[i + 1]){
                count ++;
                if (max < count){
                    max = count;
                    ans = nums[i];
                }
            }
            else{
                count = 0;
            }
        }
        return ans;
    }
}