package Acmicpc.Step20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DivideAndConquerTest {
	static int whiteCount = 0;
	static int blueCount = 0;
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
		if (base == 0) whiteCount++;
		else blueCount++;
		return true;
	}
	static void divide(int x, int y, int N) {
		if (N == 1) {
			if (arr[x][y] == 0) {
				whiteCount++;
			}
			else blueCount++;
			return;
		}
		
		if (check(x, y, N)) return;
		
		divide(x, y, N/2);
		divide(x+(N/2), y, N/2);
		divide(x, y+(N/2), N/2);
		divide(x+(N/2), y+(N/2), N/2);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
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
		System.out.println(whiteCount);
		System.out.println(blueCount);
	}
}
