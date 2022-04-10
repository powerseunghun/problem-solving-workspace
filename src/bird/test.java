package bird;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class test {
	static char[][] arr = null;
	static void star(int x, int y, int N) {
		int t = N/3;
		if (N == 1) {
			arr[x][y] = '*';
			return;
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (!(i==1&&j==1)) {
					star(x+(t*i), y+(t*j), t);
				}
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		arr = new char[N][N];
		
		for (int i = 0; i < arr.length; i++) {
			Arrays.fill(arr[i],' ');
		}
		
		star(0, 0, N);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sb.append(arr[i][j]);
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
		br.close();
	}
}
