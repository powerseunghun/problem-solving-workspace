package Acmicpc.As.B2.TenThousandth.Two.Six;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseWords12606 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String str = null;
		
		for (int i = 1; i <= N; i++) {
			str = br.readLine();
			sb.append("Case #").append(i).append(": ");
			for (int j = str.split(" ").length-1; j >= 0; j--) {
				sb.append(str.split(" ")[j]).append(" ");
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
