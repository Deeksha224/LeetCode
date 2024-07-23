class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int count = numBottles;
        while (numBottles >= numExchange){
            int a = numBottles / numExchange;
            count = a + count;
            numBottles = (numBottles % numExchange) + a;
        }
        return count;
    }
}