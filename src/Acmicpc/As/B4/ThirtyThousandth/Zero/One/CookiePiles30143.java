package Acmicpc.As.B4.ThirtyThousandth.Zero.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CookiePiles30143 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), n = 0, a = 0, d = 0;
		String str = null;
		while(T-- > 0) {
			str = br.readLine();
			n = Integer.parseInt(str.split(" ")[0]);
			a = Integer.parseInt(str.split(" ")[1]);
			d = Integer.parseInt(str.split(" ")[2]);
			
			sb.append(n*(2*a+(n-1)*d)/2).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
