public class Solution {
    public boolean isPalindrome(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(s == null || s.length() == 0)    return true;
        int length = s.length();
        s = s.toLowerCase();
        int head = 0;
        int tail = length - 1;
        char[] chars = s.toCharArray();
        while(head < tail){
            while(!isValidChar(chars[head])){
                if(head + 1 < length){
                    head++;
                }else{
                    break;
                }
            }
            
            while(!isValidChar(chars[tail])){
                if(tail > 0){
                //if(tail - 1 >= 0){              //这里把>=写成>了, 有两个case就没过, ".," "a ."
                    tail--;
                }else{
                    break;
                }
            }
            
            if(head > tail)     return true;
            //if(head > tail || (head == length - 1 && tail == 0))    return true;  上面那个条件就足够了
            if(chars[head] != chars[tail] || !isValidChar(chars[head]))   return false;
            head++;
            tail--;
        }
        return true;
    }
    
    private boolean isValidChar(char c){
        if(c >= '0' && c <= '9')    return true;
        if(c >= 'a' && c <= 'z')    return true;
        return false;
    }
}
//********又写的, 更简洁, 但是刚开始写的时候少考虑条件了*******************

public class Solution {
    public boolean isPalindrome(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(s == null || s.length() == 0 || s.length() == 1){
            return true;
        }
        
        s = s.toLowerCase();
        
        char[] arr = s.toCharArray();
        
        int i = 0;
        int j = arr.length - 1;
        
        while(i < j){
            while(! isValidChar(arr[i])){
                if(i == arr.length - 1){
                    break;
                }else{
                    i++;
                }
            }
            while(! isValidChar(arr[j])){
                if(j == 0){
                    break;
                }else{
                    j--;
                }
            }
            
            if(i > j)   return true;
            if(arr[i] != arr[j] /*|| !isValidChar(arr[i])*/){    //去掉这个条件也完全对唉! 
                return false;   
            }
            
            j--;
            i++;      
        }
        
        return true;
    }
    
    private boolean isValidChar(char c){
        if(c >= '0' && c <= '9')    
            return true;
            
        if(c >= 'a' && c <= 'z')
            return true;
            
        return false;
    }
}

//**************究极版************把i,j的判定条件写到while语句中, 保证i, j的值在正确范围之内

public class Solution {
    public boolean isPalindrome(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(s == null || s.length() == 0 || s.length() == 1){
            return true;
        }
        
        s = s.toLowerCase();
        
        char[] arr = s.toCharArray();
        
        int i = 0;
        int j = arr.length - 1;
        
        while(i < j){
            while(! isValidChar(arr[i]) && i < arr.length - 1){
                //if(i == arr.length - 1){
                  //  break;
                //}else{
                    i++;
                //}
            }
            while(! isValidChar(arr[j]) && j > 0){
                //if(j == 0){
                  //  break;
                //}else{
                    j--;
                //}
            }
            
            if(i > j)   return true;                            //........这里很关键, 很容易漏, 去掉的话[. ,] 这种就判定为false了, 其实是true
            if(arr[i] != arr[j] /*|| !isValidChar(arr[i])*/){
                return false;
                
            }
            
            j--;
            i++;
            
            
          
        }
        
        return true;
    }
    
    private boolean isValidChar(char c){
        if(c >= '0' && c <= '9')    
            return true;
            
        if(c >= 'a' && c <= 'z')
            return true;
            
        return false;
    }
}
