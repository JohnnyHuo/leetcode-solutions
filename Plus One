//Given a number represented as an array of digits, plus one to the number.

public class Solution {
    public int[] plusOne(int[] digits) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int carry = 0;
        int len = digits.length;
        
        if(digits[len - 1] + 1 > 9){
            digits[len - 1] = 0;
            carry = 1;
        }else{
            digits[len - 1] ++;
        }
        
        for(int i = len - 2; i >= 0; i--){
            if(digits[i] + carry > 9){
                digits[i] = 0;
                carry = 1;
            }else{
                digits[i] += carry;
                carry = 0;
            }
        }
        
        if(carry == 1){
            int[] result = new int[len + 1];
            result[0] = 1;
            for(int i = 0; i < len; i ++){
                result[i + 1] = digits[i]; 
            }
            return result;
        }
        
        return digits;
    }
}
