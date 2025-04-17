package Acmicpc.As.B2.ThirtyThousandth.Three.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BeautifulSequence33488 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0;
		
		while(T-- > 0) {
			N = Integer.parseInt(br.readLine());
			sb.append("YES").append("\n");
			for (int i = 1; i <= N; i++) {
				sb.append(i + " ");
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
