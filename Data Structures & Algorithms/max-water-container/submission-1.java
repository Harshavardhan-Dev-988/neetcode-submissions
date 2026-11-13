class Solution {
    public int maxArea(int[] heights) {
        int left = 0, right = heights.length-1;
        int maxCapacity = 0;
        while(left < right){
            maxCapacity = Math.max(maxCapacity, (right-left)*Math.min(heights[left],heights[right]));
            heights[left]<heights[right]?left++:right++;
        } 

        return maxCapacity;
    }
}
