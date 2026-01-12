package Acmicpc.As.B3.ThirtyThousandth.Four.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GPAComputation34797 {
	static double func(char c) {
		return 0.025 * ('3'-c);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		double res = 0;
		String str = null;
		
		for (int i = 0; i < n; i++) {
			str = br.readLine();
			switch(str.charAt(0)) {
			case 'A':
				res += 4.0/n+func(str.charAt(1));
				break;
			case 'B':
				res += 3.0/n+func(str.charAt(1));
				break;
			case 'C':
				res += 2.0/n+func(str.charAt(1));
				break;
			case 'D':
				res += 1.0/n;
				break;
			case 'E':
				break;
			}
		}
		
		System.out.println(String.format("%.7f", res));
		br.close();
	}
}
