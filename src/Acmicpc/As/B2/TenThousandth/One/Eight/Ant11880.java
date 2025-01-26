package Acmicpc.As.B2.TenThousandth.One.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ant11880 {
	static long sqrt(long a) {
		return a*a;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		String str = null;
		long a = 0, b = 0, c = 0;
		
		while(T-- > 0) {
			str = br.readLine();
			a = Long.parseLong(str.split(" ")[0]);
			b = Long.parseLong(str.split(" ")[1]);
			c = Long.parseLong(str.split(" ")[2]);
			sb.append(sqrt(a+b+c-Math.max(a, Math.max(b, c))) + sqrt(Math.max(a, Math.max(b, c))));
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
