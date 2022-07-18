package Acmicpc.As.B3.TenThousandth.One.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CookieLovers11134 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), a = 0, b = 0;
		String tmp = null;
		
		while(T-- > 0) {
			tmp = br.readLine();
			a = Integer.parseInt(tmp.split(" ")[0]);
			b = Integer.parseInt(tmp.split(" ")[1]);
			
			sb.append(a % b == 0 ? (a/b)+"\n" : (a/b+1)+"\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
