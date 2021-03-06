public class Solution{
    public boolean isValid(String s){
        if(s.length() == 0 || s.length() % 2 == 1){
            return false;
        }
        
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            }else{ 
                if(stack.isEmpty()){
                    return false;
                }else{
                    char temp = stack.peek();
                    char current = s.charAt(i);
                    if(temp == '('&& current == ')'||temp == '['&& current == ']'||temp == '{'&& current == '}'){
                        stack.pop();
                    }else{
                        return false;
                    }
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}
