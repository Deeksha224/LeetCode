class Solution {
    public boolean checkPerfectNumber(int num) {
        int temp = 0;
        for (int i = 1; i < (num/2) + 1; i++){
            if (num % i == 0){
                temp += i;
            }
        }
        if (temp == num){
            return true;
        }
        return false;
    }
}