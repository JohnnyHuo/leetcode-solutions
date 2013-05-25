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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(n <= 0)  return head;
        ListNode prev = new ListNode(0);
        prev.next = head;
        ListNode n1 = prev.next, n2 = prev.next;
        
        while(n2 != null && n > 0){
            n2 = n2.next;    
            n--;
        }
        
        if(n >=0 )  return head;
        
        while(n2 != 0){
            n2 = n2.next;
            n1 = n1.next;
            prev = prev.next;
        }
        
        prev.next = n1.next;
        
        return head;
    }
}

//+++++++++++++++++++++++++又写了一个, leetcode提交不了+++++++++++++++++++++++++++++++++++
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(n <= 0)    return head;
        ListNode prev = new ListNode(0), n1 = head, n2 = head;
        
        while(n2 != null && n > 0){
            n2 = n2.next;
            n--;
        } 
        
        if(n >= 0){
            return head;
        }
        
        while(n2 != null){
            n2 = n2.next;
            n1 = n1.next;
            prev = prev.next;
            
        }
        
        prev.next = n1.next;
        
        return head;
    }
}
//=============隔了几天又写的, 不对呀, 边界条件没掌握好=============

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if( n <= 0) return head;
        
        ListNode prev = new ListNode(0);
        prev.next = head;
        ListNode n1 = head, n2 = head;
        head = prev;
        
        while(n1 != null && n - 1 > 0){  //************* SHOULD BE "n > 0" **********************
            n1 = n1.next;
            n--;
        }
        
        if(n > 0)  return head.next;
        
        while(n1 != null){  //*************after this while loop, n1 is null*****************
            n1 = n1.next;
            n2 = n2.next;
            prev = prev.next;
        }
        
        prev.next = n2.next;
        
        return head.next;
    }
}
