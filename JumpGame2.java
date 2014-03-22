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

// 一个一个区域往前进，不会漏掉任何一个可能性，每次最多从当前区域跳到下一个区域。
// http://fisherlei.blogspot.com/2012/12/leetcode-jump-ii.html
public class JumpGame2 {
    
    public int jump(int[] A) {
        
        if (A == null || A.length == 0)
            return 0;
        if(A.length == 1)
            return 0;
        
        int count = 0;
        int start = 0;
        int end = 0;
        int n = A.length;
        while(end<n)
        {
            int max = 0;
            count ++;
            for(int i = start; i <= end; i++)
            {
                if(A[i]+i >= n-1)
                    return count;
                if(A[i]+i > max)
                    max = A[i]+i;
            }
            start = end+1;
            end = max;
            
        }
        
        return count;  
        
    }
    
}
