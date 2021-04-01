package Acmicpc.Step19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NumberOfPaper1780 {
	static int minusOne = 0;
	static int zero = 0;
	static int one = 0;
	static int[][] paper = null;
	static boolean check(int x, int y, int N) {
		int fv = paper[x][y];
		
		for (int i = x; i < x + N; i++) {
			for (int j = y; j < y + N; j++) {
				if (fv != paper[i][j]) {
					return false;
				}
			}
		}
		if (fv == -1) {
			minusOne++;
		}
		else if (fv == 0) {
			zero++;
		}
		else {
			one++;
		}
		
		return true;
		
	}
	static void divide(int x, int y, int N) {
		if(N == 1) {
			switch(paper[x][y]) {
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
		
		if (check(x, y, N)) {
			return;
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				divide(x + (N / 3) * i, y + (N / 3) * j, N / 3);
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		paper = new int[N][N];
		
		// StringTokenizer... 
		// if use String split -> time Limit 1f
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < paper[i].length; j++) {
				paper[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		divide(0, 0, N);
		
		System.out.println(minusOne);
		System.out.println(zero);
		System.out.println(one);
	}
}
