class Solution {
    public boolean isPalindrome(int x) {
        int temp = 0;
        int r = x;
        while (r > 0){
            int c = r % 10;
            temp = temp * 10 + c;
            r /= 10;
        }
        return (temp == x);
    }
}