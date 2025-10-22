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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head,fast=head;
        while(fast.next!=null && fast.next.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode temp=reverse (slow.next);slow=head;
        while(temp!=null && slow!=null){
            if(temp.val!=slow.val)return false;
            temp=temp.next;slow=slow.next;
        }return true;
    }public static ListNode reverse(ListNode temp){
        ListNode prev=null,current=null;
        while(temp!=null){
            prev=current;
            current=temp;
            temp=temp.next;
            current.next=prev;

        }
        return current;
    }
}