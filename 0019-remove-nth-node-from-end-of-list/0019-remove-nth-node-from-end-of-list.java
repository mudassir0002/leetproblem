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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        if (head == null) {
            return head;
        }
        int size = 0; // Start from 0 to correctly count the size of the list.
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        
        // Special case: if the node to be removed is the head.
        if (size == n) {
            return head.next;
        }
        
        temp = head;
        int i = 1;
        while (i < size - n) { // Stop one node before the target.
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next; // Skip the nth node from the end.

        return head;
    }
}
