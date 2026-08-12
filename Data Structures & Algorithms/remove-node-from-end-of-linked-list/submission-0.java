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
        List<ListNode> list = new ArrayList();
        int len = 0;
        ListNode curr = head;
        while(curr !=null){
            list.add(curr);
            curr = curr.next;
            len++;
        }
        int remove = len-n;
        if(remove == 0){
            return head.next;
        }
        list.get(remove-1).next = list.get(remove).next;
        return head;
    }
}

// [1,2,3,4,5,6]

// slow = 2,3,4
// fas = 4,5,6