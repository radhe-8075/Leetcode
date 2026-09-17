class Solution {
    public int mySqrt(int x) {
  // return(int)Math.sqrt(x);
      int l=0 ,r=x;
      int ans=-1;
      while(l<=r){
        int mid=l+(r-l)/2;
        if(1L*mid*mid<=x){
            ans=mid;
            l=mid+1;
        }
        else r=mid-1;

      }
      return ans;
    }
}