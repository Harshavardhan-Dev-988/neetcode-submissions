class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        counter_nums = dict()
        sol = []
        for num in nums:
            counter_nums[num] = 1 + counter_nums.get(num,0)
        return [key for key, value in counter_nums.items() if value >= k]
            