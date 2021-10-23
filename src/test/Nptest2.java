package test;

public class Nptest2 {
	static int[] arr = null;
	static void dfs(int n, int d, int idx) {
		if (d >= n) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
		
		for (int i = idx; i <= 5; i++) {
			arr[d] = i;
			dfs(n, d+1, i+1);
		}
	}
	public static void main(String[] args) {
		arr = new int[3];
		dfs(arr.length, 0, 1);
	}
}
