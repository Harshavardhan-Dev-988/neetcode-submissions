class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>         (Collections.reverseOrder());
        for (int stone : stones){
            maxHeap.add(stone);
        }
        while(maxHeap.size()>1){
            int largestStone = maxHeap.poll();
            int nextLargestStone = maxHeap.poll();
            if(largestStone!=nextLargestStone){
                maxHeap.add(largestStone-nextLargestStone);
            }
        }
        if (maxHeap.size()==1){
            return maxHeap.poll();
        }

        return 0;  
    }
}
