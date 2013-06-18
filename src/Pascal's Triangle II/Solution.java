/*
Given an index k, return the kth row of the Pascal's triangle.

For example, given k = 3,
Return [1,3,3,1].

Note:
Could you optimize your algorithm to use only O(k) extra space?*/

public class Solution {
    public ArrayList<Integer> getRow(int rowIndex) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>>   triangle = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i <= rowIndex; i++){
            ArrayList<Integer> tmp = new ArrayList<Integer>();
            tmp.add(1);
            if(i > 0){
                for(int j = 0; j < triangle.get(i - 1).size() - 1; j++){
                    tmp.add(triangle.get(i - 1).get(j) + triangle.get(i - 1).get(j + 1));
                }
                tmp.add(1);
            }
            triangle.add(tmp);
        }
        return triangle.get(rowIndex);
    }
}


//********************O(k) Solution
/*
���û�����O(k)�ռ�����ƣ���ô����һ��һ�е������ɡ����Ҫֱ�����ɵ�i�У���������k=3��������������������һ�����̣�
1 0 0 0    k = 0
1 1 0 0    k = 1
1 1 1 0
1 2 1 0    k = 2
1 2 1 1
1 2 3 1
1 3 3 1    k = 3
��������ʵ���Ͼ���һ��in-place�ĵ������̡�ÿ��������һ�е�ʱ������������Ӧλ��1��Ȼ������������ÿһ��ϵ����
http://blog.csdn.net/abcbc/article/details/8982651
*/

public ArrayList<Integer> getRow(int rowIndex) {  
  // Start typing your Java solution below  
  // DO NOT write main() function  
  ArrayList<Integer> result = new ArrayList<Integer>(rowIndex + 1);  
  for (int i = 0; i <= rowIndex; i++) {  
    result.add(0);  
  }  
  result.set(0, 1);  
  for (int i = 1; i <= rowIndex; i++) {  
    result.set(i, 1);  
    for (int j = i - 1; j > 0; j--) {  
      result.set(j, result.get(j) + result.get(j - 1));  
    }  
  }  
  return result;  
}  