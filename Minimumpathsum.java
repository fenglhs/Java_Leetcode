/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//http://gongxuns.blogspot.com/2012/12/leetcodeminimum-path-sum.html
package leetcodegroup2;

/**
 *
 * @author hbq5062
 */
public class Minimumpathsum {
        public int minPathSum(int[][] grid) {
     if(grid.length ==0) return 0;  
      int row = grid.length;  
      int col = grid[0].length;
      int[][] Min = new int[row][col];  
      Min[0][0] =grid[0][0];  
      for(int i =1; i < row; i ++)  
      {  
        Min[i][0] =Min[i-1][0] + grid[i][0];  
      }  
      for(int i =1; i< col; i++)  
      {  
        Min[0][i] = Min[0][i-1] + grid[0][i];  
      }  
      for(int i =1; i< row; i++)  
      {  
        for(int j =1; j< col; j++)  
        {  
          Min[i][j] = Math.min(Min[i-1][j], Min[i][j-1]) + grid[i][j];  
        }  
      }  
      return Min[row-1][col-1];  
 } 
}