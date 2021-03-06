/*
*Implement strStr().
*Returns a pointer to the first occurrence of needle in haystack, or null if needle is not part of haystack.
*/
/********************************String.subString()用法:******************************************************************************************************************
substring

public String substring(int beginIndex)
Returns a new string that is a substring of this string. The substring begins with the character at the specified index and extends to the end of this string.
Examples:

 "unhappy".substring(2) returns "happy"
 "Harbison".substring(3) returns "bison"
 "emptiness".substring(9) returns "" (an empty string)
 
Parameters:
beginIndex - the beginning index, inclusive.
Returns:
the specified substring.
Throws:
IndexOutOfBoundsException - if beginIndex is negative or larger than the length of this String object.
substring

public String substring(int beginIndex,
                        int endIndex)
Returns a new string that is a substring of this string. The substring begins at the specified beginIndex and extends to the character at index endIndex - 1. Thus the length of the substring is endIndex-beginIndex.
Examples:

 "hamburger".substring(4, 8) returns "urge"
 "smiles".substring(1, 5) returns "mile"

 
Parameters:
beginIndex - the beginning index, inclusive.
endIndex - the ending index, exclusive.
Returns:
the specified substring.
Throws:
IndexOutOfBoundsException - if the beginIndex is negative, or endIndex is larger than the length of this String object, or beginIndex is larger than endIndex.
*/

/*
public class Solution {
    public String strStr(String haystack, String needle) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(haystack == null || needle == null)  return null;
        
        int haystackSize = haystack.length();
        int needleSize = needle.length();
        int bound = haystackSize - needleSize + 1;  //这里 + 1, 因为String.subString(beginIndex, endIndex) 运算出来的subString长度为endIndex - beginIndex, subString从beginIndex那个character开始, 一直到endIndex - 1 位置的character结束.
        int i = 0;
        while(i < bound){
            if(haystack.subString(i, i+needleSize).equals(needle)){
                return needle;
            }
        }
        return null;
    }
}
*//*
public class Solution {
    public String strStr(String haystack, String needle) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(haystack == null || needle == null)  return null;
        
        int haystackSize = haystack.length();
        int needleSize = needle.length();
        int bound = haystackSize - needleSize + 1;  // 因为下面判断条件中用的是i<bound; 若改成i<=bound, 则此处不用+1;  还有就是index都是从0开始的, 唉, 这么简单的问题每次都犯迷糊
        int i = 0;
        while(i < bound){
            if(haystack.substring(i, i+needleSize).equals(needle)){
                return haystack.substring(i);
            }
            i++;
        }
        return null;
    }
}
*/
//for loop更简洁*********************************************************************************************************************************
public class Solution {
    public String strStr(String haystack, String needle) {
        // Start typing your Java solution below
        // DO NOT write main() function
    if(haystack == null || needle == null)  return null;
    int h = haystack.length();
    int n = needle.length();
    for(int i = 0; i <= h - n; i++){
        if(haystack.substring(i, i+n).equals(needle))
            return haystack.substring(i);
    }
    return null;
    }
}
