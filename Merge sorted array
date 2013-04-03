//=======================================Insert from the end of the new array, not the front======================

public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        int cur = m + n - 1;
        
        while(cur >= 0){
            
            if(m < 1){  //A is empty, then just copy B into A
                for(int i = 0; i < n ; i++){
                    A[i] = B[i];
                }
                return;
            }
            
            if(n < 1){ //B is empty, don't have to do anything
                return;
            }
            
            //Neither A or B is empty, copy B into A, from the end of array
            if(A[m - 1] < B[n - 1]){
                A[cur] = B[n - 1];
                n--;
                cur--;                //Dont forget this
            }else{
                A[cur] = A[m - 1];
                m--;
                cur--;              //Dont forget this
            }
        }
    }
}
