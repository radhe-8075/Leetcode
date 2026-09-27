class Solution {
    public int maxEqualAdjacentPairs(int[] nums) {

        int ans = 0;
        int best = 0;

        HashMap<Long, Integer> map = new HashMap<>();

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1]) {
                ans++;
            } else {

                int a = Math.min(nums[i], nums[i - 1]);
                int b = Math.max(nums[i], nums[i - 1]);

                long key = ((long) a << 32) | b;

                int count = map.getOrDefault(key, 0) + 1;
                map.put(key, count);

                best = Math.max(best, count);
            }
        }

        return ans + best;
    }
}