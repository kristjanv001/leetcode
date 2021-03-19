# O(n^2)T | O(1)S
class Solution:
    def longestPalindrome(self, s: str) -> str:
        
        if len(s) < 1:
            return ""
        
        if s == None:
            return None
        
        start = 0
        end = 0
        
        for i in range(len(s)):
            even = self.getLongest(s, i, i + 1)
            odd = self.getLongest(s, i, i)
            currentMax = max(even, odd)
            
            if currentMax > end - start:
                start = i - (currentMax - 1) // 2
                end = i + currentMax // 2
            
        return s[start : end + 1]

    def getLongest(self, s, leftIdx, rightIdx):
        while leftIdx >= 0 and rightIdx < len(s) and s[leftIdx] == s[rightIdx]:
            leftIdx -= 1
            rightIdx += 1
        return rightIdx - leftIdx - 1
