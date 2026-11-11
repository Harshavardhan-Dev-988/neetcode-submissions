class Solution {
    public int trap(int[] height) {
        int leftMax = height[0], rightMax = height[height.length-1];
        int res = 0;
        int left = 0, right = height.length-1;
        while(left < right){
            if(leftMax<rightMax){
                res += leftMax-height[left];
                left+=1;
                leftMax = Math.max(leftMax, height[left]);
            }
            else{
                res += rightMax-height[right]; 
                right-=1;
                rightMax = Math.max(rightMax, height[right]);
            }
        }
        return res;
    }
}


