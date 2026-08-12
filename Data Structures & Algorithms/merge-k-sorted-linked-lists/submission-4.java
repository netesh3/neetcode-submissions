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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0){
            return null;
        }
        List<ListNode> res = new ArrayList();
        res.add(new ListNode(Integer.MIN_VALUE));

        for(int i=0;i<lists.length;i++){
            ListNode temp = merge(res.get(0),lists[i]); 
            res = new ArrayList();
            res.add(temp);
            System.out.println(res.size());
        }
        ListNode finalHead = res.get(0);
        return finalHead.next;
    }

    public ListNode merge(ListNode l1, ListNode l2){
            ListNode res = new ListNode(0);
            ListNode head = res;
            ListNode curr1 = l1;
            ListNode curr2 = l2;
            while(curr1!=null && curr2!=null){
                if(curr1.val>curr2.val){
                    res.next = curr2;
                    res = res.next;
                    curr2= curr2.next;
                }else{
                    res.next = curr1;
                    res = res.next;
                    curr1= curr1.next;
                }
            }
            if(curr1 !=null){
                res.next = curr1;
            } else{
                res.next = curr2;
            }  
        return head.next;   
    }
}


/*
[

    [1,1,2,3,3,4,5,6]
]





*/