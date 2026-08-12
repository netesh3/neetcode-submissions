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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode a = head;
        ListNode b = head.next;
        if(b == null){
            return head;
        }
        while(b!=null){
            int x = a.val;
            int y = b.val;
            int gcd = gcd(x,y);
            ListNode node = new ListNode(gcd);
            a.next = node;
            node.next = b;
            a = b;
            b = b.next;
        }
        return head;
    }

    // public int gcd(int x, int y){
    //     int min = Math.min(x,y);
    //     for(int i = min;i>=1;i--){
    //         if(x%i == 0 && y%i == 0){
    //             return i;
    //         }
    //     }
    //     return 0;
    // }
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
/*
[12,3,4,6]

[12,3,4]

*/