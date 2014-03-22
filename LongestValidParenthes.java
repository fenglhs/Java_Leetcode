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
public class LongestValidParenthes {
        public int longestValidParentheses(String s) {
            if (s == null)
                return 0;
            StringBuilder stack = new StringBuilder();
            int max = 0;
            int currentmax = 0;
            int i = 0;
            while(i<s.length())
            {
                if(s.charAt(i)=='(')
                    stack.append('(');
                else
                {
                    if(stack.length()==0)
                    {
                        max = Math.max(max,currentmax);
                        currentmax = 0;
                    }
                    else
                    {
                        currentmax +=2;
                        stack.deleteCharAt(stack.length()-1);
                    }
                }
                
                i++;
            }
            
            return Math.max(max, currentmax); 
        
    }
        public void test()
        {
            String s = "()";
            System.out.println(longestValidParentheses(s));
        }
        
}
