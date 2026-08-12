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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode res = new ListNode();
        ListNode resHead = res;
        ListNode curr1 = list1;
        ListNode curr2 = list2;
        while(curr1 !=null && curr2 !=null){
            if(curr1.val>=curr2.val){
                ListNode temp = new ListNode(curr2.val);
                res.next = temp;
                res = res.next;
                curr2 = curr2.next;
            }else{
                ListNode temp = new ListNode(curr1.val);
                res.next = temp;
                res = res.next;
                curr1 = curr1.next;
            }
            System.out.println("Test");
        }
        while(curr1 !=null){
            ListNode temp = new ListNode(curr1.val);
            res.next = temp;
            res = res.next;
            curr1 = curr1.next;
        }
        while(curr2 !=null){
            ListNode temp = new ListNode(curr2.val);
            res.next = temp;
            res = res.next;
            curr2 = curr2.next;
        }
        return resHead.next;
    }
}