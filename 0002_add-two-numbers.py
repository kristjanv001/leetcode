# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        dummy_node = ListNode(0)
        current = dummy_node
        
        carry = 0
        
        while l1 or l2 or carry:
            # extract vals
            val1 = l1.val if l1 else 0
            val2 = l2.val if l2 else 0
            
            # create a digit
            val = val1 + val2 + carry
            carry = math.floor(val / 10)
            last_digit = val % 10
            
            # insert node into the list
            current.next = ListNode(last_digit)
            
            # update pointers
            current = current.next
            l1 = l1.next if l1 else None
            l2 = l2.next if l2 else None
            
        # return the list
        return dummy_node.next
