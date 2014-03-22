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
public class Generateparentese {
        ArrayList<String> result = new ArrayList<String>();
    public ArrayList<String> generateParenthesis(int n) {
        
        result.clear();
        helper("",0,0,n);
       
        
        return result;
        
    }
    
    //不管当前currentstring啥样,下一个char总是只可能是( 或者 ).
    private void helper(String currentstring, int open, int close, int n)
    {
        if(open == n && close == n)
            result.add(currentstring);
        else
        {
            if(open<n)
                helper(currentstring+"(", open+1, close, n);
            if(close<open)
                helper(currentstring+")", open, close+1, n);
        }
        
    }
}