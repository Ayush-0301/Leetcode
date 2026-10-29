class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone : stones) {
            pq.offer(stone);
        }
        
        while (pq.size() > 1) {
            int f = pq.poll();
            int s = pq.poll(); // Changed from 'd' to 's' to match your usage
            if (f != s) {
                pq.offer(f - s);
            }
        }
        
        return pq.isEmpty() ? 0 : pq.poll();
    }
}