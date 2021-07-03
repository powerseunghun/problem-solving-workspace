package CodeUp.FourThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DownhillWay4573 {
	static int count = 0;
	static int[][] arr = null;
//	static boolean[][] check = null;
	static void bt(int x, int y, int M, int N, int base) {
		if (x < 0 || y < 0 || x > (M-1) || y > (N-1)) return;
		if (arr[x][y] >= base) return;
//		if (check[x][y]) return;
		if (x == (M-1) && y == (N-1)) {
			count++;
			return;
		}
//		check[x][y] = true;
		bt(x, y+1, M, N, arr[x][y]);
		bt(x+1, y, M, N, arr[x][y]);
		bt(x, y-1, M, N, arr[x][y]);
		bt(x-1, y, M, N, arr[x][y]);
//		check[x][y] = false;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringTokenizer st = null;
		int M = Integer.parseInt(tmp.split(" ")[0]);
		int N = Integer.parseInt(tmp.split(" ")[1]);
		arr = new int[M][N];
//		check = new boolean[M][N];
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		bt(0, 0, M, N, 10001);
		System.out.println(count);
	}
}
