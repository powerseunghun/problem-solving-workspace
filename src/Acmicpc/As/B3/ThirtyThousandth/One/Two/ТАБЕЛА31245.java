package Acmicpc.As.B3.ThirtyThousandth.One.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ТАБЕЛА31245 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int a = Integer.parseInt(str.split(" ")[0]);
		int b = Integer.parseInt(str.split(" ")[1]);
		int c = Integer.parseInt(str.split(" ")[2]);
		
		sb.append(a/10);
		if (a%10 == b/10) {
			sb.append(a%10).append("'");
		} else sb.append(a%10).append(b/10);
		if (b%10 == c/10) {
			sb.append(b%10).append("'");
		} else sb.append(b%10).append(c/10);
		sb.append(c%10).append("\n");
		
		System.out.print(sb.toString());
		br.close();
	}
}
