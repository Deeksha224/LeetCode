class Solution {
    public int fib(int n) {
        // Base condition
        if (n < 2){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}