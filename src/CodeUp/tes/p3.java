package CodeUp.tes;

import java.util.Arrays;

public class p3 {
	static int maxCount = 0;
	static boolean[] check = null;
	static int[][] arr = null;
	static void bt(int k, int n, int d, int choice, int[][] T) {
		if (d >= k) {
			maxCount = choice >= maxCount ? choice : maxCount;
			return;
		}
		if (choice == k) {
			maxCount = choice >= maxCount ? choice : maxCount;
			return;
		}
		
		boolean flag = false;
		for (int i = 0; i < n; i++) {
			System.out.println("i : " + i);
			System.out.println("d : " + d);
			if (!check[d] && arr[i][d] != 0) {
				flag = true;
				check[d] = true;
				bt(k, n, d+1, choice+1, T);
				check[d] = false;
			}
		}
		if (!flag) {
			bt(k, n, d+1, choice, T);
		}
	}
	public static void main(String[] args) {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = 6, K = 4;
		check = new boolean[K];
		Arrays.fill(check, false);
		
//		int[][] T = {{1,3}, {1,1}, {2,3}, {3,4}};
		int[][] T = {{1,3}, {3,4}, {2,4}, {2,4}, {2,3}, {1,2}};
		arr = new int[N][K];
		
		for (int i = 0; i < T.length; i++) {
			for (int j = T[i][0]-1; j < T[i][1]; j++) {
				arr[i][j] = 1;
			}
		}
		bt(K, N, 0, 0, T);
		
		System.out.println(maxCount);
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
	}
}
