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
    public ListNode reverseKGroup(ListNode head, int k) {
        //every 2 of them should be removed
        
        ListNode temp = head;
        ListNode prev = temp;
        while(temp != null){
            // finding kth node
            ListNode kth = getKth(temp, k); 
            // if kth is null then linking with tail of prev and breaking the loop
            if(kth==null){
                prev.next = temp;
                break;
            }
            // storing next before breaking the link
            ListNode kNext = kth.next;
            // breaking the link the make a seperate list
            kth.next = null;
            // reversing and storing head in kth
            kth = reverse(temp);
            // if temp is equal to head means it is first segment
            if(temp==head){
                head = kth;
            }
            else{
                prev.next = kth;
            }
            prev = temp;
            temp = kNext;
            
        }
        return head;
    }
      private ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode temp =head;
        ListNode next = head;
        while(next != null){
            next = next.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev;
    }
    
    // get the next K the elelement for example 2nd
      private ListNode getKth(ListNode head, int k){
        int count = 0;
        ListNode temp = head;
        while(temp != null){
            count++;
            if(count==k){
                return temp;
            }
            temp = temp.next;
        }
        return temp;
    }
}