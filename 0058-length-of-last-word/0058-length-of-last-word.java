class Solution {
    public int lengthOfLastWord(String s) {
      s.trim();
        String[] arr = s.split(" ");
        int index = arr.length;
        String str = "";
        str += arr[index - 1];
        return (str.length());
    }
}