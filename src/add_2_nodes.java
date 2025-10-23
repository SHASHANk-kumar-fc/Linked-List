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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode dummy=new ListNode(-1);
        ListNode first=l1,second=l2,temp=dummy;
        while(first!=null && second!=null){
            int sum=first.val+second.val+carry;
            if(sum>=10){
                carry=1;
            }else{
                carry=0;
            }
            sum=sum%10;
            ListNode n=new ListNode(sum);
            temp.next=n;
            temp=n;
            first=first.next;
            second=second.next;
        }while(first!=null){int sum=first.val+carry;
            if(sum>=10){
                carry=1;
            }else{
                carry=0;
            }sum=sum%10;
            ListNode n=new ListNode(sum);
            temp.next=n;temp=n;first=first.next;
        }while(second!=null){int sum=second.val+carry;
            if(sum>=10){
                carry=1;
            }else{
                carry=0;
            }sum=sum%10;
            ListNode n=new ListNode(sum);
            temp.next=n;temp=n;second=second.next;
        }
        if(carry==1){
            ListNode n=new ListNode(1);
            temp.next=n;
        }return dummy.next;
    }
}