/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package leetcodegroup2;

import java.util.ArrayList;

/**
 *
 * @author hbq5062
 */

// 要求O(k)空间复杂度,所以得重复利用 ArrayList, 每次从后面往前刷新,最后记得加一个1在最后.
public class PascalangleII {
    public ArrayList<Integer> getRow(int rowIndex) {
        
               
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        int temp = 0;
               
        for (int i = 0; i<=rowIndex; i++)
        {
            if (i==0)
                result.add(1);
        
            if (i == 1)
            {
                result.clear();
                result.add(1);
                result.add(1);
            }
            if(i>=2)
            {
                for(int j = i-1; j > 0; j--)
                 {
                     temp = result.get(j)+result.get(j-1);
                     result.set(j, temp);
                 }            
                 result.add(1);
            }
            
        }
        
        return result;
        
    }
}