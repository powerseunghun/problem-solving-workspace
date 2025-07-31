package Acmicpc.As.B4.ThirtyThousandth.Zero.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VoteCounting30868 {
	static final int l = 5;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), n = 0;
		
		while(T-- > 0) {
			n = Integer.parseInt(br.readLine());
			
			for (int i = 0; i < n/l; i++) {
				sb.append("++++ ");
			}
			for (int i = 0; i < n%l; i++) {
				sb.append("|");
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
