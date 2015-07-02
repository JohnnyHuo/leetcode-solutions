package courseScheduleII;
import java.util.*;

public class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] res = new int[numCourses];
        if(prerequisites == null){
            return null;
        }
        
        Map<Integer, Integer> indegree = new HashMap<Integer, Integer>();    
        Map<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
        for(int i = 0; i < prerequisites.length; i++){
            for(int j = 0; j < prerequisites[0].length; j++){
                // prerequisites[i][j], j --> i, indegree of i   + 1
                if(!indegree.containsKey(i)){
                    indegree.put(i, 1);
                }else{
                    indegree.put(i, indegree.get(i) + 1);
                }
                if(!map.containsKey(j)){
                    // assume no duplicate pairs
                    ArrayList<Integer> val = new ArrayList<Integer>();
                    val.add(i);
                    map.put(j, val);
                }else{
                    map.get(j).add(i);
                }
            }
        }
        
        Queue<Integer> queue = new LinkedList<Integer>();
        
        for(int k = 0; k < numCourses; k++){
            // if(!map.containsKey(k)){
            if(indegree.get(k) == null){
                queue.offer(k);
            }
        }
        
        int index = 0;
        while(!queue.isEmpty()){
            int cur = queue.poll();
            res[index++] = cur;
            if(map.containsKey(cur)){
                ArrayList<Integer> neighbors = map.get(cur);
                for(Integer in : neighbors){
                    if(indegree.containsKey(in)){
                        indegree.put(in, indegree.get(in) - 1);
                        if(indegree.get(in) == 0){
                            queue.offer(in);
                        }
                    }
                }
            }
            
        }
        
        return res;
    }
}