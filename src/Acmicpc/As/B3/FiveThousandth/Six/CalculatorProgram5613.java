package Acmicpc.As.B3.FiveThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculatorProgram5613 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine()), B = 0;
		char c = 0;
		
		while (true) {
			c = br.readLine().charAt(0);
			if (c == '=') break;
			B = Integer.parseInt(br.readLine());
			switch(c) {
			case '+':
				A += B;
				break;
			case '-':
				A -= B;
				break;
			case '*':
				A *= B;
				break;
			case '/':
				A /= B;
				break;
			}
		}
		System.out.println(A);
		br.close();
	}
}
