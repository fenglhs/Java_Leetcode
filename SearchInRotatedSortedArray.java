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
//http://fisherlei.blogspot.com/2013/01/leetcode-search-in-rotated-sorted-array.html
//http://fisherlei.blogspot.com/2013/01/leetcode-search-in-rotated-sorted-array_3.html
public class SearchInRotatedSortedArray {
    
        public int search(int[] A, int target) {
        
            int l = 0, r = A.length - 1;
            
            while (l <= r)
            {
                int m = (l+r)/2;
                if (A[m] == target)
                    return m;
                
                if(A[m]>A[l])
                {
                    if(A[l]<=target && target<=A[m])
                        r = m-1;
                    else
                        l = m+1;                   
                }
                else
                {
                    if(A[m+1]<=target && target<=A[r])
                        l = m+1;
                    else
                        r = m-1;
                }               
                
            }
            return -1;
        }

        public void test()
        {
            int[] array = {3,1};
            int index = search(array, 1);
            
            System.out.println(index);
                   
        }
        
}
    
