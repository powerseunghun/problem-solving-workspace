package Acmicpc.As.B2.SixThousandth.Four;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseText6438 {
	public static void main(String[] args) throws Exception  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(), tsb = null;
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			tsb = new StringBuilder(br.readLine());
			sb.append(tsb.reverse().toString()).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
