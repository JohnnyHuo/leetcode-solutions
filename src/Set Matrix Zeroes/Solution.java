/**
 * Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in place.
 * @author Jinglun
 * follow up: use constant space.
 * because in space, use the first row & column to identify if the row or column contains 0, and set the first row & column to 0 in the end.
 */
public class Solution {
    public void setZeroes(int[][] matrix) {
        // Start typing your Java solution below
        // DO NOT write main() function
        //boolean isZero = false;
        //boolean columnContainsZero = false;
        boolean firstRowAllZero = false;
        boolean firstColAllZero = false;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    /*for(int m = 0; m < matrix[i].length; m++){
                        matrix[i][m] = 0;
                    }
                    for(int n = 0; n < matrix.length; n++){
                        matrix[n][j] = 0;
                    }*/
                    if(i == 0) firstRowAllZero = true;
                    if(j == 0) firstColAllZero = true;
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
                    
            }
        } 
        /*if(firstRowAllZero || firstColAllZero){
            for(int i = 0; i < matrix.length; i++){
                for(int j = 0; j < matrix[i].length; j++){
                    matrix[i][j] = 0;
                }
            }
            return;
        }*/
       
        
        for(int i = 1; i < matrix.length; i++){
            if(matrix[i][0] == 0){
                for(int j = 0; j < matrix[i].length; j++){
                    matrix[i][j] = 0;
                }
            }
        }
        
        for(int j = 1; j < matrix[0].length; j++){
            if(matrix[0][j] == 0){
                for(int i = 0; i < matrix.length; i++){
                    matrix[i][j] = 0;
                }
            }
        }
        if(firstRowAllZero){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[0][j] = 0;
            }
        }
        if(firstColAllZero){
            for(int i = 0; i < matrix.length; i++){
                matrix[i][0] = 0;
            }
        }
    }
}
