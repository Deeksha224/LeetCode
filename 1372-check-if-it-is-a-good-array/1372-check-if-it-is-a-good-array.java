class Solution {
    public boolean isGoodArray(int[] nums) {
        int x = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            while (num > 0) {
                int temp = x % num;
                x = num;
                num = temp;
            }
            if (x == 1){
                return true;
            }
        }
        return false;
    }
}
