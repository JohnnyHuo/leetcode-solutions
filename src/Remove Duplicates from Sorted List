/* Given a sorted linked list, delete all duplicates such that each element appear only once.

 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(head == null || head.next == null)   return head;
        
        ListNode n1 = head, n2 = head.next;
        
        /*if(n2.next == null){
            if(n1.val == n2.val){
                n1.next = null;
                //return n1;
            }
            return n1;
        }
        */
        
        while(n2 != null){
            if(n2.val == n1.val){
                n1.next = n2.next;
                n2 = n2.next;
            }else{
                n2 = n2.next;
                n1 = n1.next;
            }
        }
        
        return head;
    
    }
}
