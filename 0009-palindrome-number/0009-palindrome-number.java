class Solution {
    public boolean isPalindrome(int x) {
        int r=0;
        int o=x;
        if(x<0){
        return false;
        }
        else{
            while(x > 0) {
                int ld=x%10;
                r=r*10+ld;
                x/=10;
        }

        }
        return o==r;
    }
}