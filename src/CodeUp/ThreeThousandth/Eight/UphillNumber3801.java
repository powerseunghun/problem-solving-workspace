package CodeUp.ThreeThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class UphillNumber3801 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), sum = 0;
		int[][] arr = new int[N+1][10];
		Arrays.fill(arr[1], 1);
		
		for (int i = 2; i <= N; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k <= j; k++) {
					arr[i][j] = (arr[i][j] + arr[i-1][k]) % 10007;
				}
			}
		}
		for (int i = 0; i < arr[N].length; i++) {
			sum += arr[N][i];
		}
		System.out.println(sum);
	}
}
