package Acmicpc.As.B3.TwentyThousandth.Three.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Character23811 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < (i%2== 0 ? N*5 : N); k++) {
					sb.append("@");
				}
				sb.append("\n");
			}
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
