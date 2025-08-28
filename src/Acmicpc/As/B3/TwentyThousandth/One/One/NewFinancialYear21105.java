package Acmicpc.As.B3.TwentyThousandth.One.One;

import java.io.InputStreamReader;

import java.io.BufferedReader;
import java.io.IOException;

public class NewFinancialYear21105 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		String str = null;
		double P = 0, C = 0;
		
		while(T-- > 0) {
			str = br.readLine();
			P = Double.parseDouble(str.split(" ")[0]);
			C = Double.parseDouble(str.split(" ")[1]);
			
			sb.append(String.format("%.6f", P/(C+100)*100)).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
