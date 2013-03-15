public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int [] result = new int[2];
        for(int i = 0; i < numbers.length; i++){
            if(!map.containsKey(numbers[i])){
                map.put(target - numbers[i], i);
            }
            
            else if(map.get(numbers[i]) < i){
                result[0] = map.get(numbers[i]) + 1;
                result[1] = i + 1;
            }
        }
        return result;
    }
}
