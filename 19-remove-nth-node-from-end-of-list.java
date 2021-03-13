/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

// O(N)T | O(1)S
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        
        ListNode slow = dummyHead;
        ListNode fast = dummyHead;
        
        int i = 0;
        while (i <= n) {
            fast = fast.next;
            i++;
        }
        
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        
        slow.next = slow.next.next;
        return dummyHead.next;
    }
}
