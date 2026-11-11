class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res = [1]
        for i in range(0,len(nums)-1):
            res.append(nums[i]*res[-1])
        postFix = 1
        for j in range(len(nums)-1,-1,-1):
            res[j] *= postFix
            postFix *= nums[j]
        return res
