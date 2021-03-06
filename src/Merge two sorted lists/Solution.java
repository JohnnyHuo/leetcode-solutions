/* Merge two sorted linked lists and return it as a new list. 
 * The new list should be made by splicing together the nodes of the first two lists.
 *
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
    public ListNode mergeTwoLists(ListNode v1, ListNode v2) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(v1 == null)   return v2;
        if(v2 == null)   return v1;
        
        ListNode head = (v1.val < v2.val) ? v1:v2;
        while(v1 != null && v2 != null){
            ListNode temp1 = null, temp2 = null;
            if(v1.val < v2.val){
                while(v1 != null && v1.val < v2.val){
                    temp1 = v1;
                    v1 = v1.next;    
                }
                temp1.next = v2;    //让刚好比v2大的v1前面一个ListNode(刚好小于v2)指向v2
            }else{
                while(v2 != null && v2.val <= v1.val){
                    temp2 = v2;
                    v2 = v2.next;
                }
                temp2.next = v1;
            }
        }
        return head;
    }
}
