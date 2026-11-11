class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        counter_nums = dict()
        sol = []
        for num in nums:
            counter_nums[num] = 1 + counter_nums.get(num,0)
        print(counter_nums)
        sorted_dict = dict(sorted(counter_nums.items(), key=lambda item: item[1], reverse=True))
        print(sorted_dict)
        i=1
        for key, val in sorted_dict.items():
            if i<=k:
                sol.append(key)
                i+=1
            else:
                break
        return sol