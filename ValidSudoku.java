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
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        if (board == null || board.length !=9 ||board[0].length!=9)
            return false;
        if(isColumnValid(board) == false || isRowValid(board) == false || isSubBoxValid(board)==false)
            return false;
        
        else 
            return true;
        
    }
    
    public boolean isColumnValid(char[][] board)
    {
        return false;
        
    }
    
    public boolean isRowValid(char[][] board)
    {
        return false;
    }
    public boolean isSubBoxValid(char[][] board)
    {
        return false;
        
    }
}
