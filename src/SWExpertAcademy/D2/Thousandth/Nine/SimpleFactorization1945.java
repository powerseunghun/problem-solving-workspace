package SWExpertAcademy.D2.Thousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SimpleFactorization1945 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0;
		int[] arr = new int[5];
		
		for (int i = 1; i <= T; i++) {
			N = Integer.parseInt(br.readLine());
			Arrays.fill(arr, 0);
			sb.append("#" + i + " ");
			
			while (N != 1) {
				if (N % 2 == 0) {
					N /= 2;
					arr[0]++;
				}
				else if (N % 3 == 0) {
					N /= 3;
					arr[1]++;
				}
				else if (N % 5 == 0) {
					N /= 5;
					arr[2]++;
				}
				else if (N % 7 == 0) {
					N /= 7;
					arr[3]++;
				}
				else if (N % 11 == 0) {
					N /= 11;
					arr[4]++;
				}
			}
			sb.append(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4] + "\n");
		}
		System.out.print(sb.toString());
	}
}
