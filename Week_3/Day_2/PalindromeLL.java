class Solution {
    public boolean isPalindrome(ListNode head) {
        int size = 0;
        ListNode temp = head;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        int arr[] = new int[size];
        temp = head;
        int i = 0;
        while(temp!=null){
            arr[i++] = temp.val;
            temp = temp.next;
        }
        i = 0;
        int j = arr.length-1;
        while(i<=j){
            if(arr[i]!=arr[j]) return false;
            i++;
            j--;
        }
        return true;
    }
}
// Time Complexity : O(n)
//Space Complexity O(n)



class SolutionSame {
    public boolean isPalindrome(ListNode head) {
        ListNode prev = null,current = head,nex = head;
        ListNode temp = head;
        ListNode copy = null;
        ListNode last = copy;

        while(temp!=null){
            ListNode nn = new ListNode();
            nn.val = temp.val;

            if(copy == null){
                copy = nn;
                last = nn;
            }else{
                last.next = nn;
                last = nn;
            }
            temp = temp.next;
        }

        while(nex!=null){
            nex = current.next;
            current.next = prev;
            prev = current;
            current  = nex;
        }
        
        
        while(prev != null){
            if(copy.val != prev.val) return false;
            copy = copy.next;
            prev = prev.next;
        }

        return true;
    }
}


// Time Complexity : O(n)
//Space Complexity O(n)


class OptimalSolutionWithNoSpace {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head,fast = head;
        while(fast!=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast!=null){
            slow = slow.next;
        }
        ListNode prev = null,current = slow,nex = slow;
        while(nex!=null){
            nex = current.next;
            current.next = prev;
            prev = current;
            current = nex;
        }

        while(prev!=null){
            if(prev.val != head.val) return false;
            prev = prev.next;
            head = head.next;
        }

        return true;
    }
}

// Time Complexity : O(n)
//Space Complexity O(1)