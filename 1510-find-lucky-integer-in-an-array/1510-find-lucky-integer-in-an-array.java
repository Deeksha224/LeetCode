class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i : arr){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        int ans = -1;
        for (int num : map.keySet()){
            if (num == map.get(num)){
                ans = Math.max(ans,num);
            }
        }
        return ans;
    }
}