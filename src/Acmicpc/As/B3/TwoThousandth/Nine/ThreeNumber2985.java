package Acmicpc.As.B3.TwoThousandth.Nine;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ThreeNumber2985 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int A = Integer.parseInt(tmp.split(" ")[0]);
		int B = Integer.parseInt(tmp.split(" ")[1]);
		int C = Integer.parseInt(tmp.split(" ")[2]);
		char com1 = ' ', com2 = ' ';
		
		if (A+B == C) {
			com1 = '+';
			com2 = '=';
		}
		else if (A-B == C) {
			com1 = '-';
			com2 = '=';
		}
		else if (A*B == C) {
			com1 = '*';
			com2 = '=';
		}
		else if (A/B == C) {
			com1 = '/';
			com2 = '-';
		}
		else if (A == (B+C)) {
			com1 = '=';
			com2 = '+';
		}
		else if (A == (B-C)) {
			com1 = '=';
			com2 = '-';
		}
		else if (A == (B*C)) {
			com1 = '=';
			com2 = '*';
		}
		else if (A == (B/C)) {
			com1 = '=';
			com2 = '/';
		}
		System.out.println(A + "" + com1 + "" + B + "" + com2 + "" + C);
		br.close();
	}
}
