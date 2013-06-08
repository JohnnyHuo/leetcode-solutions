public class Solution{
    public int atoi(String str){
        if(str.length() == 0)   return 0;
        boolean isNeg = false;
        boolean overflow = false;           // keep it in mind
        int i = 0;
        char c = 'a';
        while(i < str.length()){
            c = str.charAt(i);
            if(Character.isWhitespace(c)){
                i++;
            }else if(c=='-'||c=='+'||Character.isDigit(c)){
                break;
            }else{
                return 0;
            }
        }
        if(c=='-'){
            isNeg = true;
            i++;
        }
        if(c=='+'){
            i++;
        }
        
        /*if(c == '-'){
            isNeg = true;
        }
        if(c == '-' || c == '+'){
            i++;
        }*/
        int n = 0;
        while(i < str.length()){
            c = str.charAt(i); //*****************************MISSED!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            if(Character.isDigit(c)){
                int x = Character.digit(c, 10);  //Character.digit() 这个方法好久没用忘了啊。。。
                if((Integer.MAX_VALUE - x)/10>=n){
                    n = 10*n + x;
                }else{
                    overflow = true;
                }
                i++;
            }else{
                break;
            }
        }
        if(overflow){
            if(isNeg){
                return Integer.MIN_VALUE;
            }else{
                return Integer.MAX_VALUE;
            }
        }else{
            if(isNeg){
                return -n;
            }else{
                return n;
            }
        }
        
    }
}

//重写了一遍。。错误百出

public class Solution {
    public int atoi(String str) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(str == null || str.length() == 0) return 0;
        str = str.trim();                                   //试了一下trim， 省去了下面isWhitespace()的判断
        int i = 0;
        while(i < str.length()){
            //if(Character.isWhitespace(str.charAt(i)))   i++;
            
            if(Character.isDigit(str.charAt(i)) || str.charAt(i) == '-' || str.charAt(i) == '+')    
                break;
            else 
                return 0;  //missed......所以卡“abc”了
        }
        
        boolean isNeg = false;
        if(str.charAt(i) == '-')
            isNeg = true;
        
        if(str.charAt(i) == '-' || str.charAt(i) == '+')
            i++;
        boolean overflow = false;
        int sum = 0;
        while(i < str.length()){
            if(Character.isDigit(str.charAt(i))){
                int x = Character.digit(str.charAt(i), 10);
                //if(sum * 10 + x <= Integer.MAX_VALUE){
                if((Integer.MAX_VALUE - x) / 10 >= sum){
                    sum = sum * 10 + x;
                }else{
                    overflow = true;
                    //break；
                }
                i++; //missed....
            }else{
                break;
            }
        }
        
        if(overflow){
            if(isNeg){
                return Integer.MIN_VALUE;
            }
            else{
                return Integer.MAX_VALUE;
            }
        }else{
            if(isNeg)   return  -sum;
                else    return sum;
        }
        
    }
}
