package wordSearchII;
import java.util.*;

public class Solution {
	public List<String> findWords(char[][] board, String[] words) {
//		List<String> res = new ArrayList<String>();
		Set<String> set = new HashSet<String>();
		if (board == null || words == null) {
			return null;
		}
		// words中的word都已经insert到trie当中啦， 所以下面的dfs method就没必要再把words放入argument当中啦
		Trie trie = new Trie();
		for (String str : words) {
			trie.insert(str);
		}
		boolean[][] visited = new boolean[board.length][board[0].length];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				dfsHelper(board, i, j, visited, trie, set, "");
			}
		}

//		return res;
		return new ArrayList<String>(set);
	}

	private void dfsHelper(char[][] board, int i, int j, boolean[][] visited,
			Trie trie, Set<String> res, String str) {
		if (i < 0 || i >= visited.length || j < 0 || j >= visited[0].length
				|| visited[i][j]) {
			return;
		}
		String cur = str + board[i][j];
		if (!trie.startWith(cur)) {
			return;
		}
		if (trie.search(cur)) {
			res.add(cur);
		}

		visited[i][j] = true;
		dfsHelper(board, i - 1, j, visited, trie, res, cur);
		dfsHelper(board, i + 1, j, visited, trie, res, cur);
		dfsHelper(board, i, j - 1, visited, trie, res, cur);
		dfsHelper(board, i, j + 1, visited, trie, res, cur);
		visited[i][j] = false;
	}
}

class TrieNode {
	boolean isLeaf;
	TrieNode[] children;

	public TrieNode() {
		children = new TrieNode[26];
	}
}

class Trie {
	private TrieNode root;

	public Trie() {
		root = new TrieNode();
	}

	public void insert(String word) {
		if (word == null || word.length() == 0) {
			return;
		}
		TrieNode node = root;
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			int index = c - 'a';
			if (node.children[index] == null) {
				node.children[index] = new TrieNode();
			}
			node = node.children[index];
		}
		node.isLeaf = true;
	}

	public boolean search(String word) {
		if (word == null || word.length() == 0) {
			return true;
		}
		TrieNode node = root;
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			int index = c - 'a';
			if (node.children[index] == null) {
				return false;
			} else {
				node = node.children[index];
			}
		}
		if (node.isLeaf = true) {
			return true;
		}
		return false;
	}

	public boolean startWith(String word) {
		if (word == null || word.length() == 0) {
			return true;
		}
		TrieNode node = root;
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			int index = c - 'a';
			if (node.children[index] == null) {
				return false;
			} else {
				node = node.children[index];
			}
		}
		return true;
	}
}