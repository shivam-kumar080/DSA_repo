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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp1=list1;
        ListNode temp2=list2;
        for(int i=1;i<=a-1;i++){
            temp1=temp1.next;
        }
        ListNode p=temp1.next;
        for(int i=a;i<=b;i++){
            p=p.next;
        }
        temp1.next=list2;
        while(temp2.next!=null){
            temp2=temp2.next;
        }
        temp2.next=p;
        return list1;
        
    }
}