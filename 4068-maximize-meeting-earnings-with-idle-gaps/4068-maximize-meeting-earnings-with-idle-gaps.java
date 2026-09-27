class Solution {
    public long maxEarnings(int[][] meetings) {

        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));

        PriorityQueue<long[]> pq =
            new PriorityQueue<>((a, b) -> Long.compare(a[0], b[0]));

        long best = Long.MIN_VALUE;
        long ans = 0;

        for (int[] m : meetings) {

            int start = m[0];
            int end = m[1];
            int revenue = m[2];

            while (!pq.isEmpty() && pq.peek()[0] <= start) {
                long[] cur = pq.poll();

                best = Math.max(best, cur[1]);
            }

            long dp = revenue;

            if (best != Long.MIN_VALUE) {
                dp = Math.max(dp, revenue + start + best);
            }

            ans = Math.max(ans, dp);

            pq.offer(new long[]{end, dp - end});
        }

        return ans;
    }
}