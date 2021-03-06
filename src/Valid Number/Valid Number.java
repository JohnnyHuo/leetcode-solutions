//*****正则表达式******
/* 数量限定:
 * 某个字符后的数量限定符用来限定前面这个字符允许出现的个数。最常见的数量限定符包括“+”、“?”和“*”（不加数量限定则代表出现一次且仅出现一次）：
 * + 加号代表前面的字符必须至少出现一次。(1次、或多次)。例如，「goo+gle」可以匹配google、gooogle、goooogle等;
 * ? 问号代表前面的字符最多只可以出现一次。(0次、或1次)。例如，「colou?r」可以匹配color或者colour;
 * * 星号代表前面的字符可以不出现，也可以出现一次或者多次。(0次、或1次、或多次)。例如，「0*42」可以匹配42、042、0042、00042等。
 * 选择:
 *  竖直分隔符代表选择。例如「gray|grey」可以匹配grey或gray。
 * 匹配:
 * 圆括号可以用来定义操作符的范围和优先度。例如，「gr(a|e)y」等价于「gray|grey」，「(grand)?father」匹配father和grandfather。
 * 上述这些构造子都可以自由组合，因此，「H(ae?|ä)ndel」和「H(a|ae|ä)ndel」是相同的。
*/

public class Solution {
    public boolean isNumber(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        //whitespace and sign
        //number
        //exponential part
    //return s.matches("\\s*[-|+]?(\\d+\\.?|\\d*\\.?\\d+)(e[-|+]?\\d+)?\\s*");   
    
    return s.matches("\\s*[-|+]?(\\.?\\d+|\\d+\\.?\\d+|\\d+\\.?)(e[-|+]?\\d+)?\\s*");  //条理更清晰
    }
}
