class Solution {
    public int maxSubarray(int[] nums) {

        int[] freq = new int[501];
        int[] pairs = new int[1001];

        int left = 0;
        int bad = 0;
        int ans = 0;

        for (int right = 0; right < nums.length; right++) {

            int x = nums[right];

            int add = pairs[x];

            for (int y = 1; y + x <= 500; y++) {
                add += freq[y] * freq[x + y];
            }

            bad += add;

            for (int y = 1; y + x <= 500; y++) {
                pairs[x + y] += freq[y];
            }

            freq[x]++;

            while (bad > 0) {

                int x1 = nums[left];
                freq[x1]--;

                int remove = pairs[x1];

                for (int y = 1; y + x1 <= 500; y++) {
                    remove += freq[y] * freq[x1 + y];
                }

                bad -= remove;

                for (int y = 1; y + x1 <= 500; y++) {
                    pairs[x1 + y] -= freq[y];
                }

                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}