package Acmicpc.As.B3.ThirtyThousandth.Four.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExactChange34301 {
	static int[] arr = new int[] {150, 30, 15, 5, 1};
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < arr.length; i++) {
			if (N >= arr[i]) {
				sb.append(N/arr[i]).append(" ");
				N -= (N/arr[i]) * arr[i];
			} else {
				sb.append("0 ");
			}
		}
		
		System.out.println(sb.reverse().toString().substring(1));
		br.close();
	}
}
