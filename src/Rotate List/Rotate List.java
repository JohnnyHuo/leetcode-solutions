/*Given a list, rotate the list to the right by k places, where k is non-negative.

For example:
Given 1->2->3->4->5->NULL and k = 2,
return 4->5->1->2->3->NULL.*/

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
    public ListNode rotateRight(ListNode head, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(n <= 0)  return head;
        
        ListNode n1 = head, n2 = head;
        
        while(n2 != null && n > 0){
            n2 = n2.next;
            n--;
        }
        
        if(n >= 0)  return head;
        
        while(n2 != null){
            n1 = n1.next;
            n2 = n2.next;
        }
        
        ListNode res = n1;
        
        while(n1.next != null){
            n1 = n1.next;
        }
        
        n1.next = head;
        
        return res;  
    }
}

/*

Progress: 12/29 test cases passed.
input  output	expected	
{}, 0	{}	{}	
   
{}, 1	{}	{}	
   
{1}, 0	{1}	{1}	
   
{1}, 1	{1}	{1}	
   
{1}, 99	{1}	{1}	
   
{1,2}, 0	{1,2}	{1,2}	
   
{1,2}, 1	{1,2}	{2,1}	
   
{1,2}, 2	{1,2}	{1,2}	
   
{1,2}, 3	{1,2}	{2,1}	
   
{1,2}, 5	{1,2}	{2,1}	
   
{1,2,3}, 0	{1,2,3}	{1,2,3}	
   
{1,2,3}, 1	{1,2,3}	{3,1,2}	
   
{1,2,3}, 2	{1,2,3}	{2,3,1}	
   
{1,2,3}, 3	{1,2,3}	{1,2,3}	
   
{1,2,3}, 4	{1,2,3}	{3,1,2}	
   
{1,2,3}, 5	{1,2,3}	{2,3,1}	
   
{1,2,3}, 10	{1,2,3}	{3,1,2}	
   
{1,2,3,4,5}, 0	{1,2,3,4,5}	{1,2,3,4,5}	
   
{1,2,3,4,5}, 1	{1,2,3,4,5}	{5,1,2,3,4}	
   
{1,2,3,4,5}, 2	{1,2,3,4,5}	{4,5,1,2,3}	
   
{1,2,3,4,5}, 3	{1,2,3,4,5}	{3,4,5,1,2}	
   
{1,2,3,4,5}, 4	{1,2,3,4,5}	{2,3,4,5,1}	
   
{1,2,3,4,5}, 5	{1,2,3,4,5}	{1,2,3,4,5}	
   
{1,2,3,4,5}, 6	{1,2,3,4,5}	{5,1,2,3,4}	
   
{1,2,3,4,5}, 7	{1,2,3,4,5}	{4,5,1,2,3}	
   
{1,2,3,4,5}, 8	{1,2,3,4,5}	{3,4,5,1,2}	
   
{1,2,3,4,5}, 9	{1,2,3,4,5}	{2,3,4,5,1}	
   
{1,2,3,4,5}, 10	{1,2,3,4,5}	{1,2,3,4,5}	
   
{4,8,-1,0,2}, 13	{4,8,-1,0,2}	{-1,0,2,4,8}	
  
*/

//========================不大对呀, 下面是改进的版本, 应该能做出来吧``=====================还是不对==========
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
    public ListNode rotateRight(ListNode head, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(n == 0)  return head;
        if(head == null || head.next == null)    return head;
        
        ListNode n1 = head, n2 = head, counter = head;
        int count = 0;
        
        while(counter != null){
            counter = counter.next;
            count++;    
        }
        
        int k = n % count;
        
        while(n2 != null && k > 0){
            n2 = n2.next;
            k--;
        }
        
        //if(n >= 0)  return head;
        
        while(n2 != null){
            n1 = n1.next;
            n2 = n2.next;
        }
        
        ListNode res = n1;
        
        while(n1.next != null){
            n1 = n1.next;
        }
        
        n1.next = head;
        
        return res;
        
        
        
        
    }
}
//------------还是不对------------------

//************终于过了**********************

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
    public ListNode rotateRight(ListNode head, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(n == 0)  return head;
        if(head == null || head.next == null)    return head;
        
        ListNode counter = head;
        ListNode n1 = head;
        ListNode n2 = head;
        //ListNode tail = head;
        ListNode prev = new ListNode(0);
        ListNode res;
        prev.next = head;
        ListNode tail = prev;
        
        int length = 0;
        
        while(counter != null){
            counter = counter.next;
            length++;    
        }
        
        n = n % length;
        
        if( n == 0) return head;    //这里忘记判断了, 上面第一行就判断了这种情况, 取余之后也还要的..
        
        while(n2 != null && n > 0){
            n2 = n2.next;
            tail = tail.next;
            n--;
        }
        
        //if(n >)
        
        while(n2 != null){
            n2 = n2.next;
            n1 = n1.next;
            prev = prev.next;
            tail = tail.next;
        }
        
        tail.next = head;
        prev.next = null;
        
        return n1;
        
    }
}
