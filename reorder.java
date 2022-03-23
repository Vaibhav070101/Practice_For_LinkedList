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
import java.util.*;
class Solution {
    public ListNode reverse(ListNode node){
        ArrayList<Integer> list=new ArrayList<>();
        
        while(node!=null){
            list.add(node.val);
            node=node.next;
        }
        Collections.reverse(list);
        ListNode head=new ListNode(list.get(0));
        ListNode tail=head;
        for(int=1;i<list.size();i++){
            tail.next=new ListNode(list.get(i));
            tail=tail.next;
        }
        return head;
    }
    public void reorderList(ListNode head){
        if(head ==  null || head.next== null || head.next.next == null){
            return;
        }

        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode midRev=reverse(slow.next);
        slow.next=null;

        while(midRev!=null){
            ListNode t1=head.next;
            ListNode t2=midRev.next;
            head.next=midRev;
            midRev.next=t1;
            head=t1;
            midRev=t2;
        }
    }
}