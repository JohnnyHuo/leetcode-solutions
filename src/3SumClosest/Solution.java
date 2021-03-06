ublic class Solution {
    public int threeSumClosest(int[] num, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(num.length < 3) {
            return Integer.MIN_VALUE;
        }
        
        int len = num.length;
        int res = Integer.MAX_VALUE;
        int result = Integer.MIN_VALUE;
        Arrays.sort(num);
        for(int i = 0; i< len - 2; i++){
            int j = i + 1;
            int z = len - 1;
            while(j < z){
                int sum = num[i] + num[j] + num[z];
                int diff = sum - target;
                if(diff == 0){
                    return sum;
                }else if(diff < 0){
                    j++;
                }else{
                    z--;
                }
                if(Math.abs(diff) < res){
                    res = Math.abs(diff);
                    result = sum;
                }
                
            }
            
        }
        return result;
    }
}
