package wildcardMatching;

public class RecursiveSolution {
    public boolean isMatch(String s, String p) {
        return isMatch(s, p, 0, 0);
    }
    
    private boolean isMatch(String s, String p, int i, int j){
        if(j == p.length()) 
            return i == s.length();
        // if current char at p is not *
        if(p.charAt(j) != '*'){
            if(i == s.length() || p.charAt(j) != s.charAt(i) && p.charAt(j) != '?'){
                return false;
            }else{
                return isMatch(s, p, i + 1, j + 1);
            }
        }else{
            // p.charAt(j) is '*', then three case : 
            // 1), '*' == '', return isMatch(s, p, i, j + 1)
            // 2), '*' == '?', return isMatch(s, p, i + 1, j + 1)
            // 3), '*' == '?????' for i < s.length(), return isMatch(s, p, i, p + 1), i++
            // in summary, validate isMatch(s, p, i, j + 1) for [i, s.length())
            while(i < s.length() && (p.charAt(j) == s.charAt(i) || p.charAt(j) == '?')){
                if(isMatch(s, p, i, j + 1)){
                    return true;
                }
                i++;
            }
        }
        
        return isMatch(s, p, i, j + 1); //consider this case : s is "aac", p is "a*b*"
        // return false;
    }
}
