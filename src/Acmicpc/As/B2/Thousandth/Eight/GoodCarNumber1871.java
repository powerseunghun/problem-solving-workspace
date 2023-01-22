package Acmicpc.As.B2.Thousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoodCarNumber1871 {
	static int getVal(String str) {
		int val = 0;
		for (int i = str.length()-1, w = 0; i >= 0; i--) {
			val += (str.charAt(i)-65) * Math.pow(26, w++);
		}
		return val;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), cn = 0;
		String tmp = null;
		
		while(N-- > 0) {
			tmp = br.readLine();
			cn = Integer.parseInt(tmp.split("-")[1]);
			sb.append(Math.abs(getVal(tmp.split("-")[0]) - cn) > 100 ? "not " : "");
			sb.append("nice\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
