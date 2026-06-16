
class RemoveFromLast {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode temp = head;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        int ri = size - n;
        if(ri == 0) head  = head.next;
        else{
            ListNode temp2 = head;
            for(int i =0;i<ri-1;i++){
                temp2 = temp2.next;
            }
            temp2.next = temp2.next.next;
        }
        
        return head;
    }
}

//Time Complexity : O(n);
// Space Complexity :O(1)