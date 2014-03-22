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
public class Plusone {
    
    public int[] plusOne(int[] digits) {
        
        int length = digits.length;
        reverse(digits);
        
        int q = 0;
        int sum = 0;
        sum = digits[0]+1;
        q = sum/10;
        sum %= 10;
        digits[0] = sum;
        for (int j = 1; j<length; j++)
        {
            sum = digits[j]+q;
            q = sum/10;
            sum = sum % 10;
            digits[j] = sum;
        }
       
        reverse(digits);
        
        if(q!=0)
        {
            int[] newdigits = new int[length+1];
            newdigits[0] = 1;
            for(int i =0; i<length; i++)
                newdigits[i+1] = digits[i];
            digits = newdigits;
        }
                
        
       
        
        return digits;
        
        
        
        
    }
    
    private void reverse(int[] digits)
    {
        if (digits == null || digits.length == 0)
            return;
        int length = digits.length;
        int temp = 0;
        int l = 0;
        int r = digits.length-1;
        
        while(l<r)
        {
            temp = digits[l];
            digits[l] = digits[r];
            digits[r] = temp;
            l++;
            r--;
        }
       
    }
    
    void test()
    {
        int[] input = {9};
        input = plusOne(input);
        
        
    }
}