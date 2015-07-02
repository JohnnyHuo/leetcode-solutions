package wordSearchII;

import java.util.List;

public class Test {
	public static void main(String[] args){
		Solution sol = new Solution();
		char[][] board = {{'a'}};
		String[] words = {"ab"};
		List<String> res = sol.findWords(board, words);
		System.out.println(res.get(0));
	}
}
