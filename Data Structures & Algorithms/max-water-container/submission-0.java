class Solution {
    public int maxArea(int[] heights) {
        int left = 0, right = heights.length-1;
        int maxCapacity = 0;
        while(left < right){
            maxCapacity = Math.max(maxCapacity, (right-left)*Math.min(heights[left],heights[right]));
            if(heights[left]<heights[right]){
                left+=1;
            }
            else{
                right-=1;
            }
        } 

        return maxCapacity;
    }
}
