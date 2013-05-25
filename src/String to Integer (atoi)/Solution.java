public class Solution{
    public int atoi(String str){
        if(str.length() == 0)   return 0;
        boolean isNeg = false;
        boolean overflow = false;
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
                int x = Character.digit(c, 10);
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
