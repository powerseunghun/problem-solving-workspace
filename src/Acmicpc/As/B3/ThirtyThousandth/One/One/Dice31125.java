package Acmicpc.As.B3.ThirtyThousandth.One.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dice31125 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), S = 0, n = 0, f = 0, m = 0;
		String str = null;
		
		while(T-- > 0) {
			str = br.readLine();
			S = Integer.parseInt(str.split(" ")[0]);
			n = Integer.parseInt(str.split(" ")[1]);
			f = Integer.parseInt(str.split(" ")[2]);
			m = Integer.parseInt(str.split(" ")[3]);
			
			sb.append((n <= S-m && S-m <= n*f) ? "YES" : "NO").append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
