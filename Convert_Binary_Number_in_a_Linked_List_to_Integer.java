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
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        int cnt=0;
        while(temp!=null){
            cnt++;
            temp = temp.next;
        }
        temp = head;
        double sum = 0;
        while(temp!=null){
            cnt--;
            if(temp.val==1){
                sum += Math.pow(2,cnt);
            }
            temp = temp.next;
        }
        return (int)sum;
    }
}