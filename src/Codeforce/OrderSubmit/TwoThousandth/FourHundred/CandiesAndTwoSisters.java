package Codeforce.OrderSubmit.TwoThousandth.FourHundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CandiesAndTwoSisters {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine()), n = 0;
		
		while (t-- > 0) {
			n = Integer.parseInt(br.readLine());
			sb.append(n%2 == 0 ? n/2-1 : n/2);
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
