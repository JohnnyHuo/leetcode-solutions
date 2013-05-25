public class Solution {
    public int sqrt(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int min = 0;
        int max = 46340; // sqrt(MAX_VALUE) == 46340.950001051984  ******关键就在这里, 太大的数字会出错*********
        int mid = x/2;
        if (x >= 46340 * 46340) {
      	return 46340;
		}
        
        while(true){
            if(min * min <= x && (min + 1) * (min + 1) > x){
                return min;
            }
            if(max * max <= x && (max + 1) * (max + 1) > x){
                return max;
            }
            
            mid = ( min + max ) / 2;
            
            if(mid * mid <= x && (mid + 1) * (mid + 1) > x){
                return mid;
            }
            if(mid * mid > x){
                max = mid - 1;
            }else{
                min = mid + 1;
            }
        }
        
        /*
        while(true){
            if(mid * mid <= x && (mid + 1) * (mid + 1) > x){
                return mid;
            }else if(mid * mid > x){
                mid --;
            }else{
                mid ++;
            }
            
        }
        */
    }
}
