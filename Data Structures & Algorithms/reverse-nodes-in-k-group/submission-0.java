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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        ListNode curr = head;
        Stack<ListNode> stack = new Stack();
        while(curr!=null){
            ListNode groupStart = curr;
            System.out.println("test");
            int i = 0;
            while(curr !=null && i<k){
                stack.push(curr);
                curr = curr.next;
                i++;
            }
            System.out.println("stack size: "+stack.size() + " i: "+i);
            if(i == k){
                while(!stack.isEmpty()){
                    ListNode pop = stack.pop();
                    prev.next = pop;
                    prev = pop;    
                }
                prev.next = curr;
            }else{
                prev.next = groupStart;
            }
            
        }
        return dummy.next;
    }
}
