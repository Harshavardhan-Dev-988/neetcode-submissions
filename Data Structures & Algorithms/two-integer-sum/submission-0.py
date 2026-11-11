class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        seen = dict()
        for i, num in enumerate(nums):
            if target - num not in seen:
                seen[num] = i
            else:
                return [seen[target-num], i]