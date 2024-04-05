package Acmicpc.As.B4.TwentyThousandth.Nine.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoodByeCodeJam29738 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), v = 0;
		
		for (int i = 1; i <= N; i++) {
			v = Integer.parseInt(br.readLine());
			sb.append("Case #").append(i).append(": ");
			
			if (v <= 25) {
				sb.append("World Finals");
			}
			else if (v <= 1000) {
				sb.append("Round 3");
			}
			else if (v <= 4500) {
				sb.append("Round 2");
			}
			else sb.append("Round 1");
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
