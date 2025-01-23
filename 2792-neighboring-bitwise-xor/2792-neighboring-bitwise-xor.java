class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int sumXOR = derived[0];
        for (int i = 1; i < derived.length; i++){
            sumXOR ^= derived[i];
        }
        return sumXOR == 0;
    }
}