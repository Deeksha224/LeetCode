class Solution {
    public int[] getConcatenation(int[] arr) {
        int[] result = new int[arr.length + arr.length];
        System.arraycopy(arr,0,result,0,arr.length);
        System.arraycopy(arr,0,result,arr.length,arr.length);
        return (result);
    }
}