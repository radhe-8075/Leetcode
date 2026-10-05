class Solution {
    public void moveZeroes(int[] nums) {
      int j=0;
      for(int i=0; i<nums.length; i++){
        if(nums[i]!=0){
            int tem=nums[i];
            nums[i]=nums[j];
            nums[j]=tem;
            j++;
            
        }
      }
        
      }
    }
