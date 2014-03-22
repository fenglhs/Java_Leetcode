/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package leetcodegroup2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author hbq5062
 */
public class CombinationSum {
 public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
     
     ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
     ArrayList<Integer> solution = new ArrayList<Integer>();
     Arrays.sort(candidates);
     helper(result, solution, 0, 0, candidates, target);
     return result;
        
    }
 public void helper(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> solution, int start, int sum, int[] num, int target){
     if(sum == target){
         ArrayList<Integer> temp = (ArrayList<Integer>) solution.clone(); // watch here, you can't just add 
// solution to result, because solution will be modified later.
         result.add(temp); 
         return;
         }
     if(sum > target) return;
     
     for(int i = start; i < num.length; i++){
         if(num[i]<=target){
             
         sum+=num[i];
         solution.add(num[i]);
         helper(result, solution, i, sum, num, target);
         solution.remove(solution.size()-1);
         sum-=num[i];
         }
     }
     
 }
 public void test()
 {
     ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
     int[] num = {1};
     
     result = combinationSum(num, 1);
     System.out.println(0);
     
 }
}