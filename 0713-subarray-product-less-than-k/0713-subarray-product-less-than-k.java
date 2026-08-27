class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count=0;
        for(int i=0; i<nums.length; i++){
            long p=1;
            for(int j=i; j<nums.length; j++){
                p*=nums[j];
               // System.out.println(p); for print to get anyalsis the what logic means  the number 
                if(p<k){
                    count++;
                    
                }
                else break;
            }
        }
        return count;
    }
}