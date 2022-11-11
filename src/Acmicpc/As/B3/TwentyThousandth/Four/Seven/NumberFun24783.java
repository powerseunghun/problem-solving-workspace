package Acmicpc.As.B3.TwentyThousandth.Four.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberFun24783 {
	static boolean func(double a, double b, double c) {
		if (a+b == c || a-b == c || a*b == c || a/b == c) return true;
		return false;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		double a = 0, b = 0, c = 0;
		String tmp = null;
		
		while (N-- > 0) {
			tmp = br.readLine();
			a = Double.parseDouble(tmp.split(" ")[0]);
			b = Double.parseDouble(tmp.split(" ")[1]);
			c = Double.parseDouble(tmp.split(" ")[2]);
			
			sb.append(func(Math.max(a, b), Math.min(a, b) ,c) ? "Possible" : "Impossible");
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
