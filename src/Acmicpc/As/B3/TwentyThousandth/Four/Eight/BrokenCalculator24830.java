package Acmicpc.As.B3.TwentyThousandth.Four.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BrokenCalculator24830 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		long pre = 1, a = 0, b = 0, res = 0;
		char op = ' ';
		String tmp = null;
		
		while(N-- > 0) {
			tmp = br.readLine();
			a = Long.parseLong(tmp.split(" ")[0]);
			op = tmp.split(" ")[1].charAt(0);
			b = Long.parseLong(tmp.split(" ")[2]);
			switch(op) {
			case '+':
				res = a+b-pre;
				break;
			case '-':
				res = (a-b)*pre;
				break;
			case '*':
				res = (a*b) * (a*b);
				break;
			case '/':
				res = a%2 == 0 ? a / 2 : (a+1) / 2;
				break;
			}
			sb.append(res + "\n");
			pre = res;
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
