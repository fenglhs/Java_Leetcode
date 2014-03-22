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

//http://www.programcreek.com/2013/01/leetcode-rotate-image-java/

//http://fisherlei.blogspot.com/2013/01/leetcode-rotate-image.html
public class Rotateimage {
    
    public void rotate(int[][] matrix) {
        
        int n = matrix.length;
	for (int i = 0; i < n / 2; i++) {
		for (int j = 0; j < Math.ceil(((double) n) / 2.); j++) {
			int temp = matrix[i][j];
			matrix[i][j] = matrix[n-1-j][i];
			matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
			matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
			matrix[j][n-1-i] = temp;
		}
	}
    }
}