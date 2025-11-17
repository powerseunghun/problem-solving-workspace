package Acmicpc.As.B2.TenThousandth.Five.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StarArrangements15121 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int S = Integer.parseInt(br.readLine());
		
		sb.append(S).append(":\n");
		
		for (int i = 2; i <= S/2+1; i++) {
			if (S%(2*i-1) == 0 || S % (2*i-1) == i) {
				sb.append(i).append(",").append(i-1).append("\n");
			}
			if (S%i == 0) {
				sb.append(i).append(",").append(i).append("\n");
			}
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
