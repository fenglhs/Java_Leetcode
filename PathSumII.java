/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package leetcodegroup2;

import java.util.ArrayList;
import leetcodegroup2.Pathsum.TreeNode;

/**
 *
 * @author hbq5062
 */
public class PathSumII {
 public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {

     ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
     
     if (root == null || sum<root.val)
         return result;

     result = helper(root, sum);
     
     return result;
     
        
    }

    private ArrayList<ArrayList<Integer>> helper(TreeNode root, int i) {
     
        ArrayList<ArrayList<Integer>> left = new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> right = new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        
        if (root == null || i<root.val)
             return result;
         
        if(root.left == null && root.right == null && i == root.val)
        {
             temp.add(root.val);
             result.add(temp);
             return result;
         }
         left = helper(root.left, i - root.val);
         right = helper(root.right, i - root.val);
         
         for (ArrayList<Integer> a : left) 
         {
             a.add(0,root.val);
         }
         for (ArrayList<Integer> a : right) 
         {
             a.add(0,root.val);
         }
         
         result.addAll(left);
         result.addAll(right);
         
         return result;   
        
    }
}
