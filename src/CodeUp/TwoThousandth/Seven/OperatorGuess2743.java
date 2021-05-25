package CodeUp.TwoThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OperatorGuess2743 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int a = Integer.parseInt(tmp.split(" ")[0]), b = Integer.parseInt(tmp.split(" ")[1]), c = Integer.parseInt(tmp.split(" ")[2]);
		tmp = br.readLine();
		int d = Integer.parseInt(tmp.split(" ")[0]), e = Integer.parseInt(tmp.split(" ")[1]);
		
		char oper = '.';
		if (a + b == c) {
			oper = '+';
		} else if (a - b == c) {
			oper = '-';
		} else if (a * b == c) {
			oper = '*';
		} else if (a / b == c) {
			oper = '/';
		}
		
		if (oper == '.') System.out.println("NO");
		else {
			switch(oper) {
			case '+':
				System.out.println(d+e);
				break;
			case '-':
				System.out.println(d-e);
				break;
			case '*':
				System.out.println(d*e);
				break;
			case '/':
				System.out.println(d/e);
				break;
			}
		}
	}
}
