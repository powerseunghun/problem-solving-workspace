package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class dac2 {
	static int[][] arr = null;
	static boolean check(int x, int y, int N) {
		int base = arr[x][y];
		
		for (int i = x; i < x+N; i++) {
			for (int j = y; j < y+N; j++) {
				if (arr[i][j] != base) {
					return false;
				}
			}
		}
		
		return true;
	}
	static void divide(int x, int y, int N) {
		if (N == 1 || check(x, y, N)) {
			System.out.print(arr[x][y]);
			return;
		}
		
		System.out.print("(");
		divide(x, y, N/2);
		divide(x, y+(N/2), N/2);
		divide(x+(N/2), y, N/2);
		divide(x+(N/2), y+(N/2), N/2);
		System.out.print(")");
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String tmp = null;
		arr = new int[N][N];
		
		for (int i = 0; i < arr.length; i++) {
			tmp = br.readLine();
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = tmp.charAt(j)-'0';
			}
		}
		divide(0, 0, N);
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
	}
}
