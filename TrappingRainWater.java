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

//http://fisherlei.blogspot.com/2013/01/leetcode-trapping-rain-water.html
/*[解题思路]
对于任何一个坐标，检查其左右的最大坐标，然后相减就是容积。所以，
1. 从左往右扫描一遍，对于每一个坐标，求取左边最大值。
2. 从右往左扫描一遍，对于每一个坐标，求最大右值。
3. 再扫描一遍，求取容积并加和。
#1和#2可以合并成一个循环，
*/
public class TrappingRainWater {
     public int trap(int[] A) {
         int[] leftmax = new int[A.length];
         int[] rightmax = new int[A.length];
         int n = A.length; 
         if (A==null || n == 0)
             return 0;
         int current_left_max = A[0];
         int current_right_max = A[n-1];
       
         int sum = 0;
         for (int i = 1; i<n-1; i++)
         {
             if(A[i-1]>current_left_max)
                 current_left_max = A[i-1];
             leftmax[i] = current_left_max;
             if(A[n-i]>current_right_max)
                 current_right_max = A[n-i];
             rightmax[n-i-1] = current_right_max;
                   
         }
         for (int i = 1; i<n-1; i++)
         {
             if ((Math.min(rightmax[i],leftmax[i]) - A[i])>0)
                 sum = sum + Math.min(rightmax[i],leftmax[i]) - A[i];
         }
         
         return sum;
         
     }
     
     public void test()
     {
         int[] A = {5,2,1,2,1,5};
         int water = trap(A);
         System.out.println(water);
     }
}
         