package Acmicpc.OrderSubmit.TwoThousandth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RobotControl2169 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringTokenizer st = null;
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		int[][] arr = new int[1001][1001], dp = new int[1001][1001];
		int[][] tmpArr = new int[2][1002];
		
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		dp[1][1] = arr[1][1];
		for (int i = 2; i < arr.length; i++) {
			dp[1][i] = (dp[1][i-1] + arr[1][i]);
		}
		for (int i = 2; i <= N; i++) {
			tmpArr[0][0] = dp[i-1][1];
			for (int j = 1; j <= M; j++) {
				tmpArr[0][j] = Math.max(tmpArr[0][j-1], dp[i-1][j])+arr[i][j];
			}
			tmpArr[1][M+1] = dp[i-1][M];
			for (int j = M; j >= 1; j--) {
				tmpArr[1][j] = Math.max(tmpArr[1][j+1], dp[i-1][j])+arr[i][j];
			}
			for (int j = 1; j <= M; j++) {
				dp[i][j] = Math.max(tmpArr[0][j], tmpArr[1][j]);
			}
		}
//		for (int i = 1; i < dp.length; i++) {
//			for (int j = 1; j < dp[i].length; j++) {
//				System.out.print(dp[i][j] + " ");
//			}
//			System.out.println();
//		}
		System.out.println(dp[N][M]);
		br.close();
	}
}
