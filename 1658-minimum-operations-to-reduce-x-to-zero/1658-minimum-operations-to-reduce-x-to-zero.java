class Solution {
    public int minOperations(int[] nums, int x) {

        int n = nums.length;

        int total = 0;

        for (int num : nums) {
            total += num;
        }

        // x is greater than total sum
        if (x > total) {
            return -1;
        }

        // We have to remove the complete array
        if (x == total) {
            return n;
        }

        int target = total - x;

        int left = 0;
        int sum = 0;
        int maxLength = -1;

        for (int right = 0; right < n; right++) {

            sum += nums[right];

            while (sum > target) {
                sum -= nums[left];
                left++;
            }

            if (sum == target) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
        }

        if (maxLength == -1) {
            return -1;
        }

        return n - maxLength;
    }
}