/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package leetcodegroup2;

/**
 *
 * @author hbq5062
 */
public class PartitionList {
     public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
    
    public ListNode partition(ListNode head, int x) {       
        ListNode dummyhead = new ListNode(0);
        ListNode left = new ListNode(0);
        ListNode right = new ListNode(0);
        ListNode temp = new ListNode(0);
        ListNode firstright = new ListNode(0);
        dummyhead.next = head;
        left = dummyhead;
        right = head;        
        if(right == null)
            return null;        
        while(right.val<x)
        {
            right = right.next;
            left = left.next;
            if(right == null)
                return head;
        }        
        firstright = right;      //记录第一个大于等于x的node，后面交换位置时需要。
        while(right.next!=null)
        {
            if(right.next.val>=x)
                 right = right.next;               
            else
            {
                temp = right.next.next;
                left.next = right.next;
                right.next = temp;
                left = left.next;
                left.next = firstright;
            }
        }
        return dummyhead.next;      
    }
}