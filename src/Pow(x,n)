/*
*这种写法, judge small 没问题, judge large Time Limit Exceeded
*/
/*
public class Solution {
    public double pow(double x, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        double res = 1.0;
        //if(x == 0.0)  return 0.0;******************这里不对啊...不该写这句, 如果x==0, n==0; 应该是1, 但是输出0;
        if(n == 0){ 
            return 1.0;
        }else if(n > 0){
            for(int i = 0; i < n; i++){
                res *= x;
            }
            return res;
        }else{
            //for(int i = 0; i < n; i++){  ****************负数的时候当然不能复制上面正数的情况啊啊....拙计啊*******************************
            for(int i = 0; i > n; i--){
                res /= x;
            }
            return res;
        }
    }
}
*/
//+++++++++++++++++++++++++++++++++快速指数, 这应该是此题考查的地方+++++++++++++++++++++++++++++++++
public class Solution {
    public double pow(double x, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(n == 0){
            return 1;
        }
        if(n == 1){
            return x;
        }
        boolean isNeg = n > 0 ? false : true;
        double result = 1;
        double product = x;         //----------------其实直接用x也可以---------------------
        int m = Math.abs(n);
        String binary = Integer.toBinaryString(m);
        for(int i = binary.length() - 1; i >= 0 ; i--){
            if(binary.charAt(i) == '1'){         //-----------------这里的'1', 刚开始写成1, 注意是字符.!!--------
                result *= product;
            }
            product *= product;
        }
        if(isNeg){
            result =  1/result;
        }
        return result;
       
    }
}
