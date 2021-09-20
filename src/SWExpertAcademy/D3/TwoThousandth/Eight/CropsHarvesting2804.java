package SWExpertAcademy.D3.TwoThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CropsHarvesting2804 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int[][] arr = null;
		int T = Integer.parseInt(br.readLine()), N = 0, sum = 0;
		
		for (int i = 1; i <= T; i++) {
			sum = 0;
			N = Integer.parseInt(br.readLine());
			arr = new int[N][N];
			for (int j = 0; j < N; j++) {
				tmp = br.readLine();
				for (int k = 0; k < tmp.length(); k++) {
					arr[j][k] = tmp.charAt(k) - '0';
				}
			}
			for (int j = 0; j < N/2; j++) {
				for (int k = N/2-j; k <= (N/2+j); k++) {
					sum += arr[j][k];
				}
			}
			for (int j = N/2; j >= 0; j--) {
				for (int k = N/2-j; k <= (N/2+j); k++) {
					sum += arr[N-j-1][k];
				}
			}
			sb.append("#" + i + " " + sum + "\n");
		}
		System.out.print(sb.toString());
	}
}
