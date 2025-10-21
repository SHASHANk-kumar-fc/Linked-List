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
        return rec(head,null,null);
    }public static ListNode rec(ListNode front,ListNode prev,ListNode current){
        if(front==null)return current;
        prev=current;
        current=front;
        front=front.next;
        current.next=prev;
        return rec(front,prev,current);

    }
}