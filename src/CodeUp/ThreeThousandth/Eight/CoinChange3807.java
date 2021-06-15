package CodeUp.ThreeThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CoinChange3807 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int M = Integer.parseInt(tmp.split(" ")[0]);
		int N = Integer.parseInt(tmp.split(" ")[1]);
		int[][] arr = new int[M+1][N+1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] coins = new int[M+1];
		arr[0][0] = 1;
		
		for (int i = 1; i <= M; i++) {
			coins[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 1; i <= M; i++) {
			for (int j = 0; j <= N; j++) {
				if (j < coins[i]) {
					arr[i][j] = arr[i-1][j];
				}
				else arr[i][j] = arr[i][j-coins[i]] + arr[i-1][j];
			}
		}
		
		System.out.println(arr[M][N]);
	}
}
