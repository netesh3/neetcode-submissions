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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        Stack<Integer> stack = new Stack();
        ListNode curr = head;
        int index = 1; // 1-indexed as per problem constraints

        // First Pass: Push values between 'left' and 'right' indices onto stack
        while (curr != null) {
            if (index >= left && index <= right) {
                stack.push(curr.val);
            }
            curr = curr.next;
            index++;
        }
        System.out.println("stack: "+stack);
        curr = head;
        index = 1;
        while (curr != null && !stack.isEmpty()) {
            if (index >= left && index <= right) {
                curr.val = stack.pop();
            }
            curr = curr.next;
            index++;
        }
        return head;
    }
}