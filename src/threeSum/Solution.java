package threeSum;
import java.util.*;

public class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums == null || nums.length == 0)
            return res;
        
        Arrays.sort(nums);
        int i = nums.length - 1;
        while(i >= 2){
            if(i != nums.length - 1 && nums[i] == nums[i + 1]){
                continue;
            }
            List<List<Integer>> curRes = twoSum(nums, i - 1, -nums[i]);
            for(int j = 0; j < curRes.size(); j++){
                curRes.get(j).add(nums[i]);
            }
            res.addAll(curRes);
            i--;
        }
        return res;
    }
    
    private static List<List<Integer>> twoSum(int[] sums, int end, int target){
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(sums == null || sums.length == 0)
            return result;
        int left = 0;
        int right = end;
        while(left < right){
            if(sums[left] + sums[right] == target){
                List<Integer> curList = new ArrayList<Integer>();
                curList.add(sums[left]);
                curList.add(sums[right]);
                result.add(curList);
                left++;
                right--;
                while(left < end && sums[left] == sums[left - 1]){
                    left++;
                }
                while(right > 0 && sums[right] == sums[right + 1]){
                    right--;
                }
            }else if(sums[left] + sums[right] > target){
                right--;
            }else{
                left++;
            }
        }
        
        return result;
    }
    
    public static void main(String[] args){
    	int[] input = new int[]{0,0,0,0};
    	List<List<Integer>> res = threeSum(input);
    	System.out.print(res.toString());
    	
    }
}