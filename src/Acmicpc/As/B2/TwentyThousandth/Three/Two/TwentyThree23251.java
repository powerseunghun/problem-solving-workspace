package Acmicpc.As.B2.TwentyThousandth.Three.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwentyThree23251 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), k = 0;
		
		while(T-- > 0) {
			k = Integer.parseInt(br.readLine());
			sb.append((k*23) + "\n");
		}
		System.out.print(sb.toString());
		br.close();
	}
}
