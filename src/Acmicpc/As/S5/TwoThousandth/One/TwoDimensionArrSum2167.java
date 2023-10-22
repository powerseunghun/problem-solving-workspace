package Acmicpc.As.S5.TwoThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoDimensionArrSum2167 {
	static int[][] arr = null, dp = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int M = Integer.parseInt(str.split(" ")[1]), K = 0;
		int a = 0, b = 0, x = 0, y = 0, sum = 0;
		arr = new int[N+1][M+1];
		dp = new int[N+1][M+1];
		
		for (int i = 1; i <= N; i++) {
			str = br.readLine();
			for (int j = 1, v = 0; j <= M; j++) {
				v = Integer.parseInt(str.split(" ")[j-1]);
				arr[i][j] = v;
				dp[i][j] = v + dp[i][j-1];
			}
		}
		
		K = Integer.parseInt(br.readLine());
		
		while(K-- > 0) {
			str = br.readLine();
			a = Integer.parseInt(str.split(" ")[0]);
			b = Integer.parseInt(str.split(" ")[1]);
			x = Integer.parseInt(str.split(" ")[2]);
			y = Integer.parseInt(str.split(" ")[3]);
			
			sum = 0;
			for (int i = a; i <= x; i++) {
				sum += dp[i][y] - dp[i][b-1];
			}
			sb.append(sum).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
