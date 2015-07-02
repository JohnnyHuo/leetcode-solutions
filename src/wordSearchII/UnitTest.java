package wordSearchII;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.*;

public class UnitTest {

	@Test
	public void test() {
//		fail("Not yet implemented");
		char[][] board = new char[][]{{'a'},{'a'}};
		String[] words = new String[]{"a"};
		Solution sol = new Solution();
		List<String> res = sol.findWords(board, words);
		assertNotNull(sol.findWords(board, words));
		assertEquals(1, res.size());
	}
}
