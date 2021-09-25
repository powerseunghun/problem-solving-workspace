package SWExpertAcademy.D3.FiveThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sum5642 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int[] arr = null, dp = null;;
		int T = Integer.parseInt(br.readLine()), N = 0, max = 0;;
		
		for (int i = 1; i <= T; i++) {
			N = Integer.parseInt(br.readLine());
			arr = new int[N+1];
			dp = new int[N+1];
			max = Integer.MIN_VALUE;
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j < arr.length; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			for (int j = 1; j < dp.length; j++) {
				dp[j] = Math.max(arr[j], dp[j-1]+arr[j]);
				max = Math.max(max, dp[j]);
			}
			sb.append("#" + i + " " + max + "\n");
 		}
		System.out.print(sb.toString());
	}
}
