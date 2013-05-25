/*
/**
 * I = 1, IV = 4, V = 5, VI = 6, X = 10, L = 50, C = 100, D = 500, M = 1000
 * 
 **/
public class Solution {
    private int cur;
    private int cumulate;
    private int result;
    
    public int romanToInt(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        this.cur = 0;
        this.cumulate = 0;
        this.result = 0;
        //char[] charArray = s.toCharArray().toLowerCase();
        char[] charArray = s.toLowerCase().toCharArray();

        for(int i = 0; i < s.length(); i++){
            
            switch(charArray[i]){
                case 'I':
                    helper(1);
                    break;
                case 'V':
                    helper(5);
                    break;
                case 'X':
                    helper(10);
                    break;
                case 'L':
                    helper(50);
                    break;
                case 'C':
                    helper(100);
                    break;
                case 'D':
                    helper(500);
                    break;
                case 'M':
                    helper(1000);
                    break;
                default:
                    //helper(0);
                    //break;
                    return 0;
            }
        }
        //return this.result;
        helper(0);
        return result;
    }
    
    private void helper(int num){
        if(this.cur == num){
            this.cumulate += num;
        }else{
            this.cur = num;
            if( cumulate < num ){
                result -= cumulate;
            }else{
                result += cumulate;
            }
            this.cumulate = num;
        }
        //this.cumulate = num;
        //return this.result;
    }
}
************************WRONG ANSWER,  ALL RETURN 0*******************************
*/
public class Solution {
    private int cur;
    private int cumulate;
    private int result;

    public int romanToInt(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        /**
         * I = 1 V = 5 X = 10 L = 50 C = 100 D = 500 M = 1000
         * 
         **/

        this.cur = 0;
        this.cumulate = 0;
        this.result = 0;
        char[] charArray = s.toLowerCase().toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
            case 'i':
                helper(1);
                break;
            case 'v':
                helper(5);
                break;
            case 'x':
                helper(10);
                break;
            case 'l':
                helper(50);
                break;
            case 'c':
                helper(100);
                break;
            case 'd':
                helper(500);
                break;
            case 'm':
                helper(1000);
                break;
            default:
                return 0;
            }
        }
        // flush the last cumulated value
        helper(0);
        return this.result;
    }

    private void helper(int num) {
        if (this.cur == num) {
            this.cumulate += num;
        } else {
            this.cur = num;
            if (cumulate > num) {
                this.result += this.cumulate;
            } else {
                this.result -= this.cumulate;
            }
            this.cumulate = num;
        }
    }
}

//==========================第二天又写了一遍, 结果最后cumulate = num;的位置写错, 然后所有有重复字符的Roman都是错误的========
public class Solution {
    private int cur;
    private int cumulate;
    private int result;
    
    public int romanToInt(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        cur = 0;
        cumulate = 0;
        result = 0;
        
        char[] charArray = s.toLowerCase().toCharArray();
        for(int i = 0; i < s.length(); i++){
            switch(charArray[i]){
                case 'i':
                    helper(1);
                    break;
                case 'v':
                    helper(5);
                    break;
                case 'x':
                    helper(10);
                    break;
                case 'l':
                    helper(50);
                    break;
                case 'c':
                    helper(100);
                    break;
                case 'd':
                    helper(500);
                    break;
                case 'm':
                    helper(1000);
                    break;
                default:
                    return 0;
            }
        }
        helper(0);
        return result;
    }
    
    private void helper(int num){
        if(cur == num){
            cumulate += num;
        }else{
            cur = num;
            if(cumulate > num){
                result += cumulate;
            }else{
                result -= cumulate;
            }
            cumulate = num;    
        }
        //cumulate = num;
    }
}
