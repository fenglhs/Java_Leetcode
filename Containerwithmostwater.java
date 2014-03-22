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
public class Containerwithmostwater {    
    
    public int maxArea(int[] height) {
        
  
    int maximum = 0;
    int temp = 0;
    
    int l = 0;
    int r = height.length - 1;
    while(l<r)
    {
        temp = (r-l) * Math.min(height[l], height[r]);
        if (temp > maximum)
            maximum = temp;
        
        if(height[l] > height[r])
        {
            int next_higher_height = height[r];
            while(height[r] <= next_higher_height)
                r--;           
        }
        else
        {
            int next_higher_height = height[l];
            while(height[l] <= next_higher_height)
                l++;                      
        }
        
        
    }    
    
    
    
    return maximum;
    
}
}