# O(N)T | O(1)S 
# There are only so many characters in an alphabet, so it's essentially constant space complexity.
# The size of the hash map does not increase in relation to the size of the input. 
# Maybe it's not technically correct to say O(1)S, but I'd argue that essentially it's O(1) space
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        start = 0
        end = 0
        curr_len = 0
        max_len = 0
        
        hashmap = {}
        
        while end < len(s):
            if s[end] not in hashmap:
                hashmap[s[end]] = True
                end += 1
                max_len = max(len(hashmap), max_len)
            else:
                hashmap.pop(s[start], None)
                start += 1
                
        return max_len
