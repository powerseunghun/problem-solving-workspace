package younjin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test4 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		// dp = N버째 계단까지의 맥스값(큰값)
		int[] arr = new int[N+1], dp = new int[N+1];
		
		for (int i = 1; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		dp[1] = arr[1];
		dp[2] = arr[1] + arr[2];
		
		for (int i = 3; i < arr.length; i++) {
			// core
			// --------------------------------------------------
			dp[i] = Math.max(dp[i-2], dp[i-3]+arr[i-1]) + arr[i];
			//	--------------------------------------------------
			
		}
		
		System.out.println(dp[N]);
		br.close();
	}
}
