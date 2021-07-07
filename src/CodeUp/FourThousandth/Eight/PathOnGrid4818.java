package CodeUp.FourThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PathOnGrid4818 {
	static int[][] arr = null;
	static int N = 0, M = 0, K = 0, count = 0;
	static void DFS(int x, int y, boolean flag) {
		if (x < 0 || y < 0 || x > (N-1) || y > (M-1)) {
			return;
		}
		if (arr[x][y] == N * M) {
			if (flag) count++;
			return;
		}
		if (K != 0 && arr[x][y] == K) {
			flag = true;
		}
		
		DFS(x, y+1, flag);
		DFS(x+1, y, flag);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		N = Integer.parseInt(tmp.split(" ")[0]);
		M = Integer.parseInt(tmp.split(" ")[1]);
		K = Integer.parseInt(tmp.split(" ")[2]);
		arr = new int[N][M];
		boolean flag = K == 0 ? true : false;
		for (int i = 0, val = 1; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++, val++) {
				arr[i][j] = val;
			}
		}
		DFS(0, 0, flag);
		System.out.println(count);
	}
}
