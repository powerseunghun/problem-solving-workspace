package Acmicpc.As.B3.TwentyThousandth.Six.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChickenPen26535 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), b = 3, cnt = 1, w = 3;
		
		while (cnt < N) {
			cnt += w;
			w += 2;
			b++;
		}
		
		for (int i = 0; i < b; i++) {
			for (int j = 0; j < b; j++) {
				if (i == 0 || i == (b-1)) {
					sb.append("x");
				}
				else {
					sb.append((j == 0 || j == (b-1)) ? "x" : ".");
				}
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
		br.close();
	}
}
