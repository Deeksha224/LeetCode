class Solution {
    public int subtractProductAndSum(int n) {
        int add = 0;
        int mul = 1;
        while (n > 0){
            int num = n % 10;
            add +=num;
            mul *=num;
            n /= 10; 
        }
        return (mul - add);
    }
}