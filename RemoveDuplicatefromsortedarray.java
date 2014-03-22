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

//向后遍历,发现第三个重复的,除了销这个,还得一网打尽之后一样的.
public class RemoveDuplicatefromsortedarray {
    
        public int removeDuplicates(int[] A) {
            
            int length = A.length;
            int newlength = length;
            int temp = 0;
            
            if (length<3)
                return length;
            
            int duplicate = A[0]-1;
            
            int prev_prev = A[0];
            int prev = A[1];
            
            for(int i = 2; i<length; i++)
            {
                if (A[i]==A[i-1] && A[i]==A[i-2])
                {
                    temp = A[i];                
                    while(A[i] == temp && i<length)
                    {
                        A[i] = duplicate;
                        newlength -- ;
                        
                        i++;
                        if (i==length) 
                            break;                       
                    }  
                }
            } 
            
            int newindex = 0;
            int oldindex = 0;
            
            while(oldindex<length)
            {
                if(A[oldindex]!=duplicate)
                    A[newindex++] = A[oldindex++];
                else
                    oldindex++;         
                
            }
            
            return newlength;
            
            
        
    }
    
}
