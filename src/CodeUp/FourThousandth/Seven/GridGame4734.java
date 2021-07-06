package CodeUp.FourThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class GridGame4734 {
	static int count = 0;
	static int[][] arr = null;
	static int[][] mem = null;
	static boolean[][] check = null;
	static void getCount(int x, int y, int M, int N, int base) {
		if (x < 0 || y < 0 || x > (M-1) || y > (N-1)) {
			return;
		}
		if (check[x][y]) return;
		
		if (arr[x][y] != base) return;
		check[x][y] = true;
		count++;
		getCount(x, y-1, M, N, base);
		getCount(x, y+1, M, N, base);
		getCount(x-1, y, M, N, base);
		getCount(x+1, y, M, N, base);
	}
	static void ff(int x, int y, int M, int N, int val) {
		if (x < 0 || y < 0 || x > (M-1) || y > (N-1)) {
			return;
		}
		if (arr[x][y] == val) return;
		
		arr[x][y] = val;
		ff(x, y-1, M, N, val);
		ff(x, y+1, M, N, val);
		ff(x-1, y, M, N, val);
		ff(x+1, y, M, N, val);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringTokenizer st = null;
		int M = Integer.parseInt(tmp.split(" ")[0]);
		int N = Integer.parseInt(tmp.split(" ")[1]);
		int max = 0, ffCount = 0;
		arr = new int[M][N];
		mem = new int[M][N];
		check = new boolean[M][N];
		
		for(int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		while (true) {
			int diffCount = 0;
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					if (arr[i][j] != arr[0][0]) diffCount++;
				}
			}
			if (diffCount == 0) {
				break;
			}
			
			for (int i = 0; i < mem.length; i++) {
				Arrays.fill(mem[i], 0);
			}
			for (int i = 0; i < check.length; i++) {
				Arrays.fill(check[i], false);
			}
			max = 0;
			
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					count = 0;
					getCount(i, j, M, N, arr[i][j]);
					mem[i][j] = count;
//					System.out.println(i + ", " + j + " : " + count);
					max = Math.max(max, count);
				}
			}
//			for (int i = 0; i < mem.length; i++) {
//				for (int j = 0; j < mem[i].length; j++) {
//					System.out.print(mem[i][j] + " ");
//				}
//				System.out.println();
//			}
//			System.out.println();
//			System.out.println("max ; " + max);
			for (int i = 0; i < mem.length; i++) {
				for (int j = 0; j < mem[i].length; j++) {
					if (max == mem[i][j]) {
						ff(i, j, M, N, arr[i][j] == 0 ? 1 : 0);
						ffCount++;
						break;
					}
				}
			}
			
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
			return;
		}
		System.out.println(ffCount);
//		System.out.println();
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
	}
}
