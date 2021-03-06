// Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

// For example, given n = 3, a solution set is:

// "((()))", "(()())", "(())()", "()(())", "()()()"

//=========下面的是自己写的, 不对, 编译都通不过==================

public class Solution {
    public ArrayList<String> generateParenthesis(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<String>   res = new ArrayList<String>();
        if(n == 0)  return res;
        int leftNo = n;
        int rightNo = n;
        Set set = new HashSet();
        //StringBuffer buffer = new StringBuffer();
        while(leftNo <= rightNo && leftNo > 0 && rightNo > 0){
            StringBuffer buffer = new StringBuffer();
            
            if(leftNo == rightNo){
                buffer.append('(');
                leftNo--;
            }else if(leftNo < rightNo){
                //(buffer.append('(') && leftNo-- )|| (buffer.append(')') && rightNo--) ; ....not a statement
                //buffer.append('(') || buffer.append(')');                               ....not a statement
                //buffer.append('(' || ')');                                              ....operator || cannot be applied to char,char
                buffer.append('(') || buffer.append(')');
                if(buffer.charAt(buffer.length() - 1) == '('){
                    leftNo--;
                }else{
                    rightNo--;
                }
            }else if(leftNo > rightNo){
                continue;    
            }
            
            if(buffer.length() == 2*n){
                String tmp = buffer.toString();
                if(set.add(tmp)){
                    res.add(tmp);
                }
            }
        }
        
        return res;
    }
}

//==========================下面贴一个正确的recursion解法=======================

import java.util.ArrayList;
public class Solution {
    public ArrayList<String> generateParenthesis(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
         
        ArrayList<String> result = new ArrayList<String>();
        char[] parens = new char[n+n];
        gp (result, 0, 0, n, parens);
         
        return result;
    }
     
    public void gp(ArrayList<String> result, int left, int right, int n, char[] parens) {
        if (left == right && left == n) {
            result.add(new String(parens));
            return;
        }
         
        if (left < n) {
            parens[left+right] = '(';
            gp(result, left+1, right, n, parens);
        }
         
        if (right < left) {
            parens[left+right] = ')';
            gp(result, left, right+1, n, parens);
        }
    }
}

//自己写了一遍.. 不大对, 已改正


public class Solution {
    public ArrayList<String> generateParenthesis(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(n == 0)  return new ArrayList<String>();
        char[] res = new char[2*n];
        ArrayList<String> result = new ArrayList<String>();
        /*return*/ generateParenthesisHelper(result, n, 0, 0, res);
        return result;
    }
    
    private void generateParenthesisHelper(ArrayList<String> result, int n, int left, int right, char[] res){
        //ArrayList<String> result = new ArrayList<String>();
        if(left == right && left == n){
            result.add(new String(res));
            return;
        
        }
        
        if(left < n){
            res[left + right] = '(';
            generateParenthesisHelper(result, n, left + 1, right, res);   
        }
        
        if(right < left){
            res[left + right] = ')';
            generateParenthesisHelper(result, n, left, right + 1, res);   
        }
        
        
    }
}
