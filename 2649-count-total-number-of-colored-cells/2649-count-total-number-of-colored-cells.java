class Solution {
    public long coloredCells(int n) {
        long n1 = n;
        return (n1*n1) + ((n1-1)*(n1-1));
    }
}