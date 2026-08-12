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
        int len = 0;
        ListNode curr = head;
        while(curr !=null){
            curr = curr.next;
            len++;
        }
        int remove = len-n;
        if(remove == 0){
            return head.next;
        }
        ListNode c = head;
        for(int i=0;i<len-1;i++){
            if(i+1 == remove){
                c.next = c.next.next;
            }
            c = c.next;
        }
        return head;
    }
}

// [1,2,3,4,5,6]

// slow = 2,3,4
// fas = 4,5,6