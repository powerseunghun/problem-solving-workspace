package Acmicpc.As.B3.TenThousandth.One.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrianglePatternTwo11312 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int T = Integer.parseInt(br.readLine()), A = 0, B = 0;
		
		while (T-- > 0) {
			tmp = br.readLine();
			A = Integer.parseInt(tmp.split(" ")[0]);
			B = Integer.parseInt(tmp.split(" ")[1]);
			
			sb.append((long)(Math.pow(A/B, 2)) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
