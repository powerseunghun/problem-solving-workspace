package Acmicpc.As.B3.TenThousandth.Three.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MathContest13366 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), sum = 0;
		String str = null;
		
		while(T-- > 0) {
			str = br.readLine();
			sum = 0;
			for (int i = 0; i < str.length(); i++) {
				sum += str.charAt(i)-'0';
			}
			sb.append(sum%9 == 0 ? "YES" : "NO").append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
