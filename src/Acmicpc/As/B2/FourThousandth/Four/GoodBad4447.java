package Acmicpc.As.B2.FourThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoodBad4447 {
	static final String[] strs = {"G|g", "B|b"};
	static String func(String tmp) {
		int c1 = tmp.length() - tmp.replaceAll(strs[0], "").length();
		int c2 = tmp.length() - tmp.replaceAll(strs[1], "").length();
		
		return c1==c2 ? "NEUTRAL" : c1>c2 ? "GOOD" : "A BADDY";
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			tmp = br.readLine();
			sb.append(tmp + " is ").append(func(tmp)).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
