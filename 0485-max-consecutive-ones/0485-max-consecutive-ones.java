class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int l=0; 
        int max=0;
        for(int i=0; i<n; i++){
            if(nums[i]==0){
                l=i+1;
            }
            max=Math.max(max,i-l+1);
        }
        return max;
    }
}