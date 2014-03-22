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
//从后往前扫一遍，把第一次出现非空字符的地方设为start, 之后第一次出现空格的地方设为end。
//注意start, end初始值为-1。

public class LengthofLastWord {
    
public int lengthOfLastWord(String s) {
             if (s == null )
                return 0;
            int n = s.length();
            int start = -1;
            int end = -1;
            int i = n - 1;
            while (i>=0)
            {
                if(start == -1 && s.charAt(i)!=' ')
                    start = i;
                if(start != -1 && end == -1 && s.charAt(i)==' ')
                    end = i;
                i--;
            }
            return start-end;
        }
}
