package Acmicpc.As.B3.FiveThousandth.Seven;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DoItNot5789 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String tmp = null;
		
		while(N-- > 0) {
			tmp = br.readLine();
			sb.append(tmp.charAt(tmp.length()/2-1) == tmp.charAt(tmp.length()/2) ? "Do-it\n" : "Do-it-Not\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
