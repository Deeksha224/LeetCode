class Solution {
    public int countMatches(List<List<String>> item, String ruleKey, String ruleValue) {
        int count = 0;
        for (int i = 0; i < item.size(); i++){
            if (ruleKey.equals("type") && item.get(i).get(0).equals(ruleValue)){
                count++;
            }
            if (ruleKey.equals("color") && item.get(i).get(1).equals(ruleValue)){
                count++;
            }
             if (ruleKey.equals("name") && item.get(i).get(2).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}