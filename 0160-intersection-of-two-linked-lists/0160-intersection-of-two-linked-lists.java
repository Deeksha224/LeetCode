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
        ListNode tempa = headA;
        while (tempa != null){
            ListNode tempb = headB;
            while (tempb != null){
                if (tempa == tempb){
                    return tempa;
                }
                tempb = tempb.next;
            }
           tempa = tempa.next;
        }
        return null;
    }
}