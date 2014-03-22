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
public class RemoveNthNode {
    
 
 
  public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
 
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if (head == null)
            return null;
        if (n < 0)
            return head;
        
        int nodenumber = 1;
        
        ListNode currentnode = head;
        
        while(currentnode.next!=null)
        {
            nodenumber++;
            currentnode = currentnode.next;
        }
        
        if (n>nodenumber)
            return head;
        
        if(n == nodenumber)
            return head.next;
        
        currentnode = head;
               
        for(int i = 1; i<nodenumber-n-1; i++)
             currentnode = currentnode.next;
        currentnode.next = currentnode.next.next;
        
        return head;
        
    }
}
    

