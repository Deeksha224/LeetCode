class Solution {
    public int kthFactor(int n, int k) {
        int count = k;
        for (int i = 1; i <= n; i++){
            if (n%i == 0){
                count--;
            }
            if (count==0){
                return i;
            }
        }
        return -1;
    }
}