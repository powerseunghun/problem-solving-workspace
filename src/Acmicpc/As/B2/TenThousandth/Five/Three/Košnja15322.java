package Acmicpc.As.B2.TenThousandth.Five.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Košnja15322 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int K = Integer.parseInt(br.readLine()), N = 0, M = 0;
		String str = null;
		
		while(K-- > 0) {
			str = br.readLine();
			N = Integer.parseInt(str.split(" ")[0]);
			M = Integer.parseInt(str.split(" ")[1]);
			sb.append((Math.min(N, M)-1) * 2).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
