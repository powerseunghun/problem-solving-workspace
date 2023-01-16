package Acmicpc.As.B5.TwentyThousandth.Six.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Copier26574 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), val = 0;
		
		while(T-- > 0) {
			val = Integer.parseInt(br.readLine());
			sb.append(val + " " + val + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
