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

// 用StringBuilder表示一个stack. 将扫描到的左半部依次放进stack, 一旦看到一个右半部,就和stck最上的匹配,
// 匹配完了remove该左半部.

public class ValidParentheses {
    public boolean isValid(String s) {
        if (s == null)   
            return true;
        StringBuilder stack = new StringBuilder();
        char temp = ' ';
        int i = 0;
        while(i<s.length())
        {
            temp = s.charAt(i);
            if(temp == '{' || temp == '[' || temp == '(')
                stack.append(temp);
            
            else 
            {
                if (stack.length()==0)
                    return false;
                temp = stack.charAt(stack.length()-1);
                if(match(temp, s.charAt(i))==false)
                     return false;
                stack.deleteCharAt(stack.length()-1);
            }
            i++;
         
           
        }
     if(stack.length() !=0)
            return false;
        return true;
    }
    public boolean match(char a, char b)
    {
      if((a == '(' && b == ')') || (a == '[' && b == ']') || (a == '{' && b == '}'))
          return true;
      return false;
    }
    
    public void test()
    {
        String s = "()";
        System.out.println(isValid(s));
    }
}
  
        
        