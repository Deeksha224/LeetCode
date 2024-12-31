class Solution {
    public boolean isHappy(int n) {
        int rem=0;
        int num=0;
        int c=0;
        while(num!=1){
            while(n>0){
                rem = n%10;
                num = num+(rem*rem);
                n=n/10;
            }
            if(c>10)
            return num==1;
            n = num;
            num = 0;
            c++;
        }
        return num==1;
    }
}