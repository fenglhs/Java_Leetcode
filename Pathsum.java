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
public class Pathsum {
    
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    
    public boolean hasPathSum(TreeNode root, int sum) {
        
        if(root == null) 
            return false;
        
        if(root.left == null && root.right == null)
            return root.val == sum;
        
        else
        {
            return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
        }
        
        
        
        
    }
}
    

