/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // ListNode temp1= headA;
        // ListNode temp2= headB;
        // if(headA==null || headB==null){
        //     return null;
        // }
        // while(temp1!=null){
        //     while(temp2!=null){
        //         if(temp1==temp2){
        //             return temp2;
        //         }
        //         temp2 = temp2.next;
        //     }
        //     temp2 = headB;
        //     temp1 = temp1.next;
        // }
        // return null;
        HashSet<ListNode> st = new HashSet<>();
        while(headA!=null){
            st.add(headA);
            headA = headA.next;
        }

        while(headB!=null){
            if(st.contains(headB)){
                return headB;
            }else{
                st.add(headB);
                headB = headB.next;
            }
        }

        return null;
    }
}