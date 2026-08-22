class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int j=0;
        while(j<nums.length-1){
            if(nums[j]!=nums[j+1]) {
                return nums[j];
            }
            j+=3;
        }
        return nums[nums.length-1];
    }
}