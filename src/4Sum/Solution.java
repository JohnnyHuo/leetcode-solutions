public class Solution {
    
    public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(num.length < 4) return res;
        
        Set set = new HashSet();
        Arrays.sort(num);
        for(int i = 0; i < num.length - 3; i++){
            for(int j = i + 1; j < num.length - 2; j++){
                //if(i == 0 || num[i] > num[i - 1]){
                    //int j = i + 1;
                    int k = j + 1;
                    int l = num.length - 1;
                    while( k < l){
                        if(num[k] + num[l] == target - num[i] - num[j]){
                            ArrayList<Integer> temp = new ArrayList<Integer>();
                            temp.add(num[i]);
                            temp.add(num[j]);
                            temp.add(num[k]);
                            temp.add(num[l]);
                            if(set.add(temp)){
                                res.add(temp);
                            }
                            k++;
                            l--;
                            //while(k < l && num[k] == num[k - 1]) k++;
                            //while(k < l && num[l] == num[l + 1]) l--;
                        }else if(num[k] + num[l] > target - num[i] - num[j]){
                            l--;
                        }else{
                            k++;
                        }
                    }
                }
            }
        
        return res;
    }
}
