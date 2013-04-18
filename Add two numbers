/**
 * You are given two linked lists representing two non-negative numbers. 
 * The digits are stored in reverse order and each of their nodes contain a single digit. 
 * Add the two numbers and return it as a linked list.

 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 *//*
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Start typing your Java solution below
        // DO NOT write main() function
        /*
        if(l1 == null)  return l2;
        if(l2 == null)  return l1;
        int carry = 0;
        //int val = 0;
        ListNode result = new ListNode(0);
        ListNode resultHead = result;
        //while(l1.next != null || l2.next != null){  ******逻辑错误啊,, 必须是 && , 俩都不是null, 才能进行下面的操作
        //while(l1.next != null && l2.next != null){
        while(l1 != null || l2 != null){
            result.val = (l1.val + l2.val + carry) % 10;
            //carry = (l1.val + l2.val) >= 10 ? 1 : 0; *********错了*********___其实没错....不过要注意是大于等于10, 刚开始把等于漏了.
            carry = (l1.val + l2.val + carry) / 10;
            //result = result.next;
            ListNode node = null;
            result.next = node;
            result = result.next;
            l2 = l2.next;
            l1 = l1.next;
        }
        if(carry > 0){
            result.next = new ListNode(carry);
            result = result.next;
        }
        result.next = null;

        return resultHead;
    */
        
        ListNode result = new ListNode((l1.val + l2.val) % 10);
        ListNode resultHead = result;
        int carry = (l1.val + l2.val) >= 10 ? 1 : 0;
        
        while(l1.next != null && l2.next != null){
            l1 = l1.next;
            l2 = l2.next;
            result = result.next;
            result.val = (l1.val + l2.val + carry) % 10;
            carry = (l1.val + l2.val + carry) >= 10 ? 1 : 0;
        }
        
        if(l1.next == null && l2.next == null){
            result.next = new ListNode( carry == 0 ? 0 : 1);
            result = result.next;
            result.next = null;
            return resultHead;
        }else if(l1.next == null && l2.next != null){
            while(l2.next != null){
                l2 = l2.next;
                result = result.next;
                result.val = (l2.val + carry) % 10;
                carry = (l2.val + carry) / 10;
            }
            // both l1.next and l2.next == null;
            result.next = new ListNode( carry == 0 ? 0 : 1);
            result = result.next;
            result.next = null;
            return resultHead;
        }else{//l1.next != null && l2.next == null
            while(l1.next != null){
                l1 = l1.next;
                result = result.next;
                result.val = (l1.val + carry) % 10;
                carry = (l1.val + carry) / 10;
            }
            // both l1.next and l2.next == null;
            result.next = new ListNode( carry == 0 ? 0 : 1);
            result = result.next;
            result.next = null;
            return resultHead;
        }
            
    }
}
*************************下面的为正确答案, 错误地方在于给result赋值的方式*********************************
*/

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode((l1.val + l2.val) % 10);
        ListNode resultHead = result;
        ListNode node = null;
        int carry = (l1.val + l2.val) >= 10 ? 1 : 0;
        
        while(l1.next != null && l2.next != null){
            l1 = l1.next;
            l2 = l2.next;
            /*result = result.next;
            result.val = (l1.val + l2.val + carry) % 10;
            carry = (l1.val + l2.val + carry) >= 10 ? 1 : 0;*/
            node = new ListNode((l1.val + l2.val + carry)%10);
            carry = (l1.val + l2.val + carry)/10;
            result.next = node;
            result = node;
        }
        
        if(l1.next == null && l2.next == null){
            /*result.next = new ListNode( carry == 0 ? 0 : 1);
            result = result.next;
            result.next = null;
            return resultHead;*/
            if(carry != 0){
                result.next = new ListNode(1);
                //result = result.next;
            }
            //result.next = null;
            
        }else if(l1.next == null && l2.next != null){
            while(l2.next != null){
                l2 = l2.next;
                //result = result.next;
                //result.val = (l2.val + carry) % 10;
                node = new ListNode((l2.val + carry) % 10);
                result.next = node;
                result = node;
                carry = (l2.val + carry) / 10;
            }
            // both l1.next and l2.next == null;
            if(carry != 0){
                result.next = new ListNode(1);
                //result = result.next;
            }
            //result.next = null;
        }else{//l1.next != null && l2.next == null
            while(l1.next != null){
                l1 = l1.next;
                //result = result.next;
                node = new ListNode((l1.val + carry) % 10);
                result.next = node;
                result = node;
                carry = (l1.val + carry) / 10;
            }
            // both l1.next and l2.next == null;
            if(carry != 0){
                result.next = new ListNode(1);
                //result = result.next;
            }
            //result.next = null;
        }
        return resultHead;    
    }
}
