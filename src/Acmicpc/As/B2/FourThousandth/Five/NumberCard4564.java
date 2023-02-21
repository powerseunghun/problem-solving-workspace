package Acmicpc.As.B2.FourThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberCard4564 {
	static int func(int S) {
		int res = 1;
		while (S != 0) {
			res *= S%10;
			S /= 10;
		}
		return res;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int S = 0;
		
		while(true) {
			S = Integer.parseInt(br.readLine());
			if (S == 0) break;
			sb.append(S).append(" ");
			while (S >= 10) {
				S = func(S);
				sb.append(S).append(" ");
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
