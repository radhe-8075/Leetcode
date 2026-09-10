class Solution {
    public int longestOnes(int[] nums, int k) {
        int s=0;
        int  e=0;
        int z=0;
        int max=0;
        while( e<nums.length){
            //include
            if(nums[e]==0)z++;
            //shrink
            while(z>k){
                if(nums[s]==0) z--;
                s++;
            }
            int size=e-s+1;
            max=Math.max(max,size);
            e++;
        }
          return max;
    }
}