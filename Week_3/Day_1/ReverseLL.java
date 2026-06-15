
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null,current = head,n = head;
        while(n!=null){
            n = current.next;
            current.next = prev;
            prev = current;
            current = n;
        }
        return prev;
    }
}
//Time Complexity : O(n)