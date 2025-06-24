class Solution {
    public int maxDistance(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('E',0);
        map.put('W',0);
        map.put('N',0);
        map.put('S',0);
        int ans=0,a=0,soo=0;
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            map.put(ch,map.get(ch)+1);
            a = Math.min(map.get('E'),map.get('W'))+Math.min(map.get('S'),map.get('N'));
            ans = Math.max(ans,i+1-2*a+2*Math.min(a,k));
        }
        return ans;
    }
}