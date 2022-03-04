class Solution {
    private class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
             this.val = val;
             }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //List Node creation and taking a temporary 
        //ListNode to handle merge sorted list
        ListNode head=new ListNode(0);
        ListNode temp=head;
        
        ListNode temp1=list1;
        ListNode temp2=list2;
        
        //traversing through both the list until one
        //of the either list reach it's null point
        while(temp1!=null && temp2!=null){
            if(temp1.val<temp2.val){
                temp.next=temp1;
                temp1=temp1.next;
            }else{
                temp.next=temp2;
                temp2=temp2.next;
            }
            temp=temp.next;
        }
        
        //Both of these if loops ensure if there are elements
        //left in any of the list then reconsider it and 
        //print it....
        if(temp1!=null){
            temp.next=temp1;
        }
        if(temp2!=null){
            temp.next=temp2;
        }
        
        return head.next;
    }
}