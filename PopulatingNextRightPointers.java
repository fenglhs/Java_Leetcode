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
public class PopulatingNextRightPointers {
    
    public class TreeLinkNode{
        int val;
        TreeLinkNode left, right, next;
        TreeLinkNode(int x){ val = x; }
          
        }
    
    public void connect(TreeLinkNode root)
    {
        TreeLinkNode parent;
        TreeLinkNode current;
        TreeLinkNode first = null;
        
        parent = root;
        if(root == null)
            return;
        parent.next = null;
        
        first = findfirstchild(parent);
        
        if (first == null)
            return;
        current = first;
        while(first!=null)
        {
              while(parent!=null)
              {
                  if(parent.left != null && parent.left != current)
                  {
                      current.next = parent.left;
                      current = parent.left;
                  }
            
            
                  if(parent.right != null && parent.right != current)
                  {
                       current.next = parent.right;
                       current = parent.right;
                  }
                  parent = parent.next;
            
               }
               current.next = null;
        
               parent = first;
        
               first = findfirstchild(parent);
               current = first;      // 第一次忘了这一句，导致time out错误，每次reset要注意各个指针的reset，不但包括parent, first, 也包括current。
        }       
               
    }
    
    public TreeLinkNode findfirstchild(TreeLinkNode parent)
    {
        while(parent != null)
        {
            if(parent.left != null)
                return parent.left;
            if(parent.right != null)
                return parent.right;
            parent = parent.next;
            
        }
        
        return null;
    }
    
    public void test()
    {
        TreeLinkNode node1 = new TreeLinkNode(1);
        TreeLinkNode node2 = new TreeLinkNode(2);
        TreeLinkNode node3 = new TreeLinkNode(3);
        TreeLinkNode node4 = new TreeLinkNode(4);
        TreeLinkNode node5 = new TreeLinkNode(5);
        
//        	{1,2,#,3,#,4,#,5}
        node1.left = node2;
        node2.right = node3;
        node3.right = node4;
        node4.right = node5;
        connect(node1);

        
    }
    
}
