/*Given an array and a value, remove all instances of that value in place and return the new length.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.*/

public class Solution {
    public int removeElement(int[] A, int elem) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int p1 = 0;
        int p2 = A.length - 1;
        
        while(p1 <= p2){
            if(A[p1] == elem){
                if(A[p2] != elem){
                    A[p1] = A[p2];
                    p2--;
                    p1++;
                }else{
                    p2--;
                }
            }else{
                p1++;
            }
        }
        return p2 + 1;
    }
}
//*******************又写了一遍***********************
public class Solution {
    public int removeElement(int[] A, int elem) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        int len = A.length;
        
        //if(len == 0 || A == null)   return 0;
        
        int i = 0, j = len - 1;
        
        
        while(i <= j){                  //***********这里注意是 <= , 写成了 < , 很多case都过不了****************
            if(A[i] == elem){
                if(A[j] != elem){
                    A[i] = A[j];
                    i++;
                    j--;
                }else{
                    j--;
                }
            }else{
                i++;
            }
        }
        
        return j + 1;
    }
}
