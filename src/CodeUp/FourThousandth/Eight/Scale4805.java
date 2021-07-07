package CodeUp.FourThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Scale4805 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine()), count = 0;
		int[][] arr = new int[N+1][N+1];
		
		for (int i = 0, x = 0, y = 0; i < M; i++) {
			tmp = br.readLine();
			x = Integer.parseInt(tmp.split(" ")[0]);
			y = Integer.parseInt(tmp.split(" ")[1]);
			arr[x][y] = 1;
		}
		for (int k = 1; k <= N; k++) {
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= N; j++) {
//					System.out.println("i, k : " + i + ", " + k + " k, j : " + k + ", " + j);
					if (arr[i][k] == 1 && arr[k][j] == 1) arr[i][j] = 1;
				}
			}
		}
		
		for (int i = 1; i <= N; i++ ) {
			count = 0;
			for (int j = 1; j <= N; j++) {
				if (i == j) continue;
				if (arr[i][j] == 0 && arr[j][i] == 0) count++;
//				System.out.print(arr[i][j] + " ");
			}
			System.out.println(count);
//			System.out.println();
		}
	}
}
