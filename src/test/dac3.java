package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class dac3 {
	static int[][] arr = null;
	static int zero = 0;
	static int minusOne = 0;
	static int one = 0;
	static boolean check(int x, int y, int N) {
		int base = arr[x][y];
		
		for (int i = x; i < x+N; i++) {
			for (int j = y; j < y+N; j++) {
				if (base != arr[i][j]) return false;
			}
		}
		
		switch(base) {
		case -1:
			minusOne++;
			break;
		case 0:
			zero++;
			break;
		case 1:
			one++;
			break;
		}
		
		return true;
	}
	static void divide(int x, int y, int N) {
		if (N == 1) {
			switch(arr[x][y]) {
			case -1:
				minusOne++;
				break;
			case 0:
				zero++;
				break;
			case 1:
				one++;
				break;
			}
			return;
		}
		
		if (check(x, y, N)) return;
		
		for (int i = 0; i < N; i+=N/3) {
			for (int j = 0; j < N; j+=N/3) {
				divide(x+i, y+j, N/3);
			}
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		
		for (int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		divide(0, 0, N);
		System.out.println(minusOne);
		System.out.println(zero);
		System.out.println(one);
		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
	}
}
