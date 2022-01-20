package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class dac {
	static int[][] arr = null;
	static int whiteCount = 0;
	static int blueCount = 0;
	static boolean check(int x, int y, int N) {
		int base = arr[x][y];
		
		for (int i = x; i < x+N; i++) {
			for (int j = y; j < y+N; j++) {
				if (arr[i][j] != base) {
					return false;
				}
			}
		}
		if (base == 1) blueCount++;
		else whiteCount++;
		
		return true;
	}
	static void divide(int x, int y, int N) {
		if (N == 1) {
			if (arr[x][y] == 1) blueCount++;
			else whiteCount++;
			return;
		}
		
		if (check(x, y, N)) return;
		
		divide(x, y, N/2);
		divide(x, y+(N/2), N/2);
		divide(x+(N/2), y, N/2);
		divide(x+(N/2), y+(N/2), N/2);
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = null;
		arr = new int[N][N];
		
		for (int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		divide(0, 0, N);
		System.out.println(whiteCount);
		System.out.println(blueCount);
		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
	}
}
