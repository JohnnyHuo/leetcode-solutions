/**Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

  *You should preserve the original relative order of the nodes in each of the two partitions.

  *For example,
  *Given 1->4->3->2->5->2 and x = 3,
  *return 1->2->2->4->3->5.
 **
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
    public ListNode partition(ListNode head, int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        /* /////////////////下面的是把node从后面插入, 所以原来的顺序反了.\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        ListNode smallStart = null;
        ListNode largeStart = null;
        
        while(head != null){
            ListNode temp = head.next;
            if(head.val < x){
                head.next = smallStart;
                smallStart = head;
            }else{
                head.next = largeStart;
                largeStart = head;
            }
            head = temp;
        }
        if(smallStart == null)  return largeStart;
        if(largeStart == null)  return smallStart;
        
        ListNode result = smallStart;
        while(smallStart.next != null){
            smallStart = smallStart.next;
        }
        smallStart.next = largeStart;
        
        return result;
        */

        if(head == null || head.next == null)
            return head;
        
        ListNode smallStart = null;
        ListNode largeStart = null;
        ListNode smallEnd = null;
        ListNode largeEnd = null;
        
        while(head != null){
            ListNode temp = head.next;
            if(head.val < x){
                if(smallStart == null){
                    head.next = null;
                    smallStart = head;
                    smallEnd = head;
                }else{
                    smallEnd.next = head;
                    head.next = null;
                    smallEnd = head;
                }
            }else{
                if(largeStart == null){
                    head.next = null;
                    largeStart = head;
                    largeEnd = head;
                }else{
                    largeEnd.next = head;
                    head.next = null;
                    largeEnd = head;
                }
            }
            head = temp;
        }
        
        if(smallStart != null){ 
            smallEnd.next = largeStart;
            return smallStart;
        }else{
            return largeStart;
        }
        
        //if(smallStart == null)  return largeStart;
        //if(largeStart == null)  return smallStart;
        
     //   ListNode result = smallStart;
    /*    while(smallStart.next != null){
            smallStart = smallStart.next;
        }
        smallStart.next = largeStart;       */
        //return result;
    }
}
