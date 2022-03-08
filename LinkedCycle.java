/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null)
            return false;
        
        HashSet<ListNode> ListSet=new HashSet<>();
        
        while(head!=null){
            if(ListSet.contains(head))
                return true;
            ListSet.add(head);
            head=head.next;
        }
        return false;
    }
}

//Using two pointer fast and slow
public class Solution {
    public boolean hasCycle(ListNode head) {
        //if(head==null || head.next==null)
           // return false;
        
        ListNode fast=head;
        ListNode slow=head;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}