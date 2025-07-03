class Solution {
    public String smallestString(String s) {
        int i = 0, n = s.length();
        char[] A = s.toCharArray();
        while (i < n && A[i] == 'a'){
            i++;
            if (i == n){
                A[n - 1] = 'z';
            }
        }
        while (i < n && A[i] != 'a'){
            A[i] = (char)('a'+((A[i] - 'a')-1));
            i++;
        }
        return String.valueOf(A);
    }
}