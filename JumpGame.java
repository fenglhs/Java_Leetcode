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

//http://fisherlei.blogspot.com/2012/12/leetcode-jump-game.html
public class JumpGame {
   public boolean canJump(int[] A) 
    {
                int maxCover = 0;  
                int n = A.length;
            for(int start =0; start<= maxCover && start<n; start++)  
            {  
                 if(A[start]+start > maxCover)  
                      maxCover = A[start]+start;  
                 if(maxCover >= n-1) return true;  
            }  
            return false;  
       }  
    
}
