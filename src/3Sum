/*public class Solution{

  ArrayList<ArrayList<Integer>> threeSum(int[] num){
    
    ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    if (num.length < 3)   return res;   
    Arrays.sort(num);
    
    for(int i = 0; i <= num.length-2; i++){
      if(i == 0 || num[i] > num[i - 1]){ //avoid duplicate solutions
        int j = i + 1;
        int k = num.length - 1;

        while(j < k){
          if(num[j] + num[k] == -num[i]){
              ArrayList<Integer> temp = new ArrayList<Integer>();
              temp.add(num[i]);
              temp.add(num[j]);
              temp.add(num[k]);
              res.add(temp);
              j++;
              k--;
              while(j < k && num[j] == num[j - 1]) j++; //avoid duplicate solutions
              while(j < k && num[k] == num[k + 1]) k--; //avoid duplicate solutions
    
            }else if(num[j] + num[k] < -num[i]){
              j++;
            }else{
              k--;
            }
          }
        }
    }
    return res;
  }
---------------------------下面的用了HashSet来去掉重复项--------------------------------------
*/

public class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
    ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    if(num.length < 3) return res;
    
    Set set = new HashSet();
    Arrays.sort(num);
    for(int i = 0; i < num.length - 2; i++){
        int j = i + 1;
        int z = num.length - 1;
        //int sum = num[j] + num[z];
        while(j < z){
            //if(sum == -num[i]){
            if(num[j] + num[z] == -num[i]){
                ArrayList<Integer> temp = new ArrayList<Integer>();
                temp.add(num[i]);
                temp.add(num[j]);
                temp.add(num[z]);
                if(set.add(temp)){
                    res.add(temp);
                }
                j++;
                z--;
            //}else if(sum > -num[i]){
            }else if(num[j] + num[z] > -num[i]){
                z--;
            }else{
                j++;
            }
        }
    }
    return res;
    }
}
}
*/
//新写了一遍, 运行的时候不是所有test都pass
public class Solution{
    
    public ArrayList<ArrayList<Integer>> threeSum(int[] num){
        
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(num.length < 3)return res;
        
        Arrays.sort(num);
        for(int i = 0; i < num.length - 2; i++){
            if(i == 0 || num[i] > num[i - 1]){
                int j = i + 1;
                int k = num.length - 1;
                while(j < k){
                    if (num[j] + num[k] == -num[i]){
                        ArrayList<Integer> temp = new ArrayList<Integer>();
                        temp.add(num[i]);
                        temp.add(num[j]);
                        temp.add(num[k]);
                        res.add(temp);
                        k--;
                        j++;
                        while(j < k && num[k] == num[k + 1]) k--;
                        while(j < k && num[j] == num[j - 1]) j++;
                    }else if(num[j] + num[k] > -num[i]){
                        k--;
                    }else{
                        j++;   
                    }
                }
            }
        }
        return res;
    }
}
