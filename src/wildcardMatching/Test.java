package wildcardMatching;

public class Test {
	public static void main(String[] args){
		RecursiveSolution rs = new RecursiveSolution();
		DpSolution dp = new DpSolution();
		String s = "aaac";
		String p = "a*b";
		System.out.println(rs.isMatch(s, p));
		System.out.println(dp.isMatch(s, p));

		System.out.println("Match s1");
		String s1 = "abbbbaaab";
		System.out.println(rs.isMatch(s1, p));
		System.out.println(dp.isMatch(s1, p));

		String s2 = "aabc";
		System.out.println("Match s2");
		System.out.println(rs.isMatch("aabc", "a*d"));
		System.out.println(dp.isMatch("aabc", "a*d"));

		System.out.println("Match s3");
		String s3 = "a";
		System.out.println(rs.isMatch(s3, p));
		System.out.println(dp.isMatch(s3, p));


		System.out.println("Match s4");
		String s4 = "abbaab";
		System.out.println(rs.isMatch(s4, p));
		System.out.println(dp.isMatch(s4, p));

		System.out.println("Match s5");
		String s5 = "ac";
		System.out.println(rs.isMatch(s5, p));
		System.out.println(dp.isMatch(s5, p));
		

	}
}
