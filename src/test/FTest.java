package test;

public class FTest {
	public static void main(String[] args) {
		int[][] v = {{1,4},{3,4},{3,10}};
		
		int[] ans = new int[2];
		ans[0] = 1^3^3;
		ans[1] = 4^4^10;
		
		System.out.println(ans[0] + " , " + ans[1]);
	}
}
