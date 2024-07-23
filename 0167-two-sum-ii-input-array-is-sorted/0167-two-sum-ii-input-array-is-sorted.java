class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length - 1; i++){
            int j = i + 1;
            while (j < numbers.length ){
                if (numbers[i] + numbers[j] == target){
                    return new int[] {i + 1, j + 1};
                }
                j++;
            }
        }
        return new int[] {-1, -1};
    }
}