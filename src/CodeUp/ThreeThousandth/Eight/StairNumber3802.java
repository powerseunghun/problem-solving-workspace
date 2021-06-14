package CodeUp.ThreeThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class StairNumber3802 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N+1][10];
		Arrays.fill(arr[1], 1);
		arr[1][0] = 0;
		
		long sum = 0;
		
		for (int i = 2; i <= N; i++) {
			for (int j = 0; j < 10; j++) {
				switch(j) {
				case 0:
					arr[i][j] = arr[i-1][j+1];
					break;
				case 9:
					arr[i][j] = arr[i-1][j-1];
					break;
				default:
					arr[i][j] = (arr[i-1][j-1] + arr[i-1][j+1]) % 1000000000;
					break;
				}
			}
		}
		
		for (int i = 0 ; i < 10; i++) {
			sum += arr[N][i];
		}
		System.out.println(sum % 1000000000);
	}
}
