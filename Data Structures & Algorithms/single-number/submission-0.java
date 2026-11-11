class Solution {
    public int singleNumber(int[] nums) {
        int res = nums[0];
        for(int n=1; n<nums.length; n++){
            res ^= nums[n];
        }
        return res;
    }
}
