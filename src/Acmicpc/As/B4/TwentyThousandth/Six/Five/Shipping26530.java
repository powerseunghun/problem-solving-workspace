package Acmicpc.As.B4.TwentyThousandth.Six.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Shipping26530 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0, q = 0;
		String tmp = null;
		double c = 0, res = 0;
		
		while(T-- > 0) {
			N = Integer.parseInt(br.readLine());
			res = 0;
			for (int i = 0; i < N; i++) {
				tmp = br.readLine();
				q = Integer.parseInt(tmp.split(" ")[1]);
				c = Double.parseDouble(tmp.split(" ")[2]);
				res += q*c;
			}
			sb.append(String.format("$%.2f\n", res));
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
