package leetcodegroup2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hbq5062
 */
//本题用了三个方法,第一个递归,第二个用排列组合知识.http://www.360doc.com/content/10/0426/08/1217123_24908058.shtml
//相当于向下走m-1次,向右n-1次,总共的m+n-2步里m-1次向下走的出现位置决定总共多少次unique走法.
//方法三是参考  http://blog.csdn.net/kenden23/article/details/17303497


public class UniquePath {
            int uniquePathCount;
        public int uniquePaths(int m, int n) {
            uniquePathCount = 0;
            int steps = 0;
            helper(steps, 0, 0, m, n);
            
            return uniquePathCount;
            
        
    }
        
        private void helper(int steps, int steps_down, int steps_right, int m, int n)
        {
            if(steps >= m+n-2)
                  uniquePathCount++; 
            else
            {
                if(steps_down < m-1)
                    helper(steps+1, steps_down+1, steps_right, m, n);
                
                if(steps_right < n-1)
                    helper(steps+1, steps_down, steps_right+1, m, n);
                
            }
            
        }
         public int uniquePaths2(int m, int n) {
             
             int result = 0;
             double fengzi = 1.0;
             double fengmu1 = 1.0;
             int fengmu2 = 1;
             
             int max = Math.max(m-1, n-1);
             int min = Math.min(m-1, n-1);
             
             for (int i = max+1; i<=m+n-2; i++)
                 fengzi = fengzi*i;
             
             for(int j = 1; j<=min; j++)
                 fengmu1 = fengmu1*j;
             
        
             if(fengmu1!=0)
              result = (int) Math.round(fengzi/fengmu1);
             
             
             return result;
         }
          public int uniquePaths3(int m, int n) {
            if(m==1 || n==1) return 1;  
        return uniquePaths(m-1, n) + uniquePaths(m, n-1);  
    }  
         
         public void test()
         {
             int m = 10;
             int n = 10;
             int result = uniquePaths(m, n);
             int result2 = uniquePaths3(m,n);
             System.out.println(result);
             System.out.println(result2);
         }
        
        
}


