package Acmicpc.As.B2.FourThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Voting4581 {
	static String check(String tmp) {
		int absent = tmp.length()-tmp.replaceAll("A", "").length();
		int y = tmp.length()-tmp.replaceAll("Y", "").length();
		int n = tmp.length()-tmp.replaceAll("N", "").length();
		
		if (tmp.length()/2 >= tmp.length()-absent) return "need quorum";
		return y==n ? "tie" : y > n ? "yes" : "no";
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		
		while(true) {
			tmp = br.readLine();
			if (tmp.equals("#")) break;
			sb.append(check(tmp)).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
