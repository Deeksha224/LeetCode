class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int min = nums[0];
        int count = 0;
         for (int num :nums){
            count += num-min;
        }
        return count;
    }
}