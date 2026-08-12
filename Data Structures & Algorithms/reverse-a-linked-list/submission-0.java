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
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode prev = null;
        ListNode curr = head;
        ListNode fast = head;
        while(curr != null){
            curr = curr.next;
            fast.next = prev;
            prev = fast;
            fast = curr;
        }
        return prev;
    }
}
