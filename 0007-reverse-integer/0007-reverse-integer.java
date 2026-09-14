class Solution {
    public int reverse(int x) {
       /* boolean neg=false;
        if(x<0){
            neg=true;
            x*=-1;
        }
        long rev=0;
        while(x>0){
            int d=x%10;
            rev=rev*10+d;
            x/=10;
        }
        if(rev>Integer.MAX_VALUE)
        {
            return 0;
        }
        if(neg==true){
            rev*=-1;
        }
            return (int) rev; */
           
             long reversed=0;
            int orginal=x;
          x=Math.abs(x);
            while(x!=0){
                int ld=x%10;
                reversed=reversed*10 + ld;
                x/=10;
            }
            if(orginal<0){
                  reversed=reversed*-1;
            }
            if(reversed>Integer.MAX_VALUE || reversed<Integer.MIN_VALUE){
                return 0;
            }
        return (int)reversed;
    }
}
