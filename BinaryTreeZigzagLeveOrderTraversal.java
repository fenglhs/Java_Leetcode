/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package leetcodegroup2;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author hbq5062
 */
public class BinaryTreeZigzagLeveOrderTraversal {
     public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
 // 用current,last两个ArrayList<TreeNode>来保存上一层和当前层node, 
 // ArrayList<Integer> temp保存last里每个node的值.  用isLeft还决定是否reverse temp, 然后加入res.
 public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
     ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
     if (root == null)
         return res;
     boolean isLeft = true;
     ArrayList<TreeNode> last = new ArrayList<TreeNode>();

     last.add(root);
     
     while(!last.isEmpty())
     {
         ArrayList<Integer> temp = new ArrayList<Integer>();    
         ArrayList<TreeNode> current = new ArrayList<TreeNode>();
         for(TreeNode node: last)
         {
             temp.add(node.val);
             if(node.left!=null)
                 current.add(node.left);
             if(node.right!=null)
                 current.add(node.right);
         }
         if(!isLeft)
             Collections.reverse(temp);
         res.add(temp);
         last = current;
         isLeft = !isLeft;             
     }
     return res;
        
    }
}