class Solution {
    public boolean isPalindrome(int x) {
         if (x < 0) {
            return false;
        }
       int save=x;
       int r,n=0;
       while(x!=0){
        r=x%10;
        x=x/10;
        n=n*10;
        n=n+r;
       }
       if(save==n){
        return true;
       }
       else
       return false;
    }
}