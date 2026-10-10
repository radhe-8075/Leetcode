class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {

        int n = nums1.length;
        int[] diff = new int[n];
        long k = (long) k1 + k2;

        int max = 0;

        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            max = Math.max(max, diff[i]);
        }

        if (k >= 0) {
            long total = 0;
            for (int d : diff) {
                total += d;
            }

            if (k >= total) {
                return 0;
            }
        }

        int[] freq = new int[max + 1];

        for (int d : diff) {
            freq[d]++;
        }

        for (int d = max; d > 0 && k > 0; d--) {
            if (freq[d] == 0) {
                continue;
            }

            long move = Math.min(k, (long) freq[d]);
            freq[d] -= (int) move;
            freq[d - 1] += (int) move;
            k -= move;
        }

        long ans = 0;

        for (int d = 0; d <= max; d++) {
            ans += (long) d * d * freq[d];
        }

        return ans;
    }
}
