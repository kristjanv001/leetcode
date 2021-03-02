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
