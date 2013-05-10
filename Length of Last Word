/*
Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

For example, 
Given s = "Hello World",
return 5.
*/

/*
public class Solution {
    public int lengthOfLastWord(String s) {
        // Start typing your Java solution below
        // DO NOT write main() 
        
        s = s.trim();
        char[] array = s.toCharArray();
        int i;
        for(i = 0; i < array.length; i++){
            if(array[i] == ' '){
                if(isLastSpace(array, i)){
                    break;
                }else{
                    continue;
                }
            }else{
                continue;
            }
        }
        //last space is found---array[i]
        int count = 0;
        for(int j = i + 1; j < array.length; j++){
            if(isValid(array[j])){
                count++;
            }
        }
        
        return count;
        
    }
    
    private boolean isValid(char c){
        if(c < 'z' && c > 'a')  return true;
        if(c < 'Z' && c > 'A')  return true;
        return false;
    }
    
    private boolean isLastSpace(char[] array, int i){
        for(int j = i + 1; j < array.length; j++){
            if(array[j] == ' '){
                return false;
            }
        }
        
        return true;
    }
}
*/

public class Solution {
    public int lengthOfLastWord(String s) {
        if(s == null)   return 0;
        
        int i ;
        
        String ss = s.trim();
        String lastWorld = new String();
        
        for(i = s.length() - 1; i >= 0; i--){
            if(ss.charAt(i) == ' ' && isValid(ss.charAt(i + 1)) ){
                lastWorld = ss.substring(i + 1);        
                break;
            
            }
            
            continue;
        }
        
        return lastWorld.length();
    }
    
    private boolean isValid(char c){
        if(c < 'z' && c > 'a')  return true;
        if(c < 'Z' && c > 'A')  return true;
        return false;
    }
    
}


//=========上面的自己写的都不对, 下面的阿伦的=========注意trim(), 还有split()函数的用法==========

public class Solution {
    public int lengthOfLastWord(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        String[] words = s.trim().split(" ");
        
        return words[words.length - 1].length();
    }
}
