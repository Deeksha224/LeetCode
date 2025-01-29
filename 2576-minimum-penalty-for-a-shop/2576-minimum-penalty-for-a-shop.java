public class Solution {
    public int bestClosingTime(String customers) {
        int max_score = 0, score = 0, best_hour = -1;
        for(int i = 0; i < customers.length(); ++i) {
            if (customers.charAt(i) == 'Y'){
                score += 1;
            }
            else{
                score += -1;
            }
            if(score > max_score) {
                max_score = score;
                best_hour = i;
            }
        }
        return best_hour + 1;
    }
}