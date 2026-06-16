class Solution {
    public ListNode mergeTwoLists(ListNode h1, ListNode h2) {
        ListNode dummy = new ListNode();
        dummy.val = 10;
        ListNode last = dummy;
        while(h1!=null && h2!=null){
            if(h1.val<h2.val){
               last.next = h1;
               last = h1;  
               h1 = h1.next;
            }else{
                last.next = h2;
                last = h2;
                h2 = h2.next;
            }
        }

        while(h2!=null){
            last.next = h2;
            last = h2;
            h2 = h2.next;
        }

        while(h1!=null){
            last.next = h1;
            last = h1;
            h1 = h1.next;
        }

       

        return dummy = dummy.next;
    
    }
}


// Time Complexity O(n)
// Space Complexity O(1)