class Solution {
    public int maxFrequencyElements(int[] nums) {

        int[] freq = new int[101];

        // Count frequency
        for (int num : nums) {
            freq[num]++;
        }

        // Find maximum frequency
        int maxFreq = 0;

        for (int f : freq) {
            maxFreq = Math.max(maxFreq, f);
        }

        // Count all elements having maximum frequency
        int ans = 0;

        for (int f : freq) {
            if (f == maxFreq) {
                ans += f;
            }
        }

        return ans;
    }
}