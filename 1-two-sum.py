# O(N)T | O(N)S
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        
        hash_map = {}
        
        for i in range(0, len(nums)):
            if target - nums[i] in hash_map:
                return [i, hash_map[target-nums[i]] ]
            else:
                hash_map[nums[i]] = i
