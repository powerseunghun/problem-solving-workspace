package CodeUp.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Calculator1231 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		ArrayList<String> op = new ArrayList<>();
		for (int i = 0; i < tmp.length(); i++) {
			if (tmp.charAt(i) == '+' || tmp.charAt(i) == '-' || 
				tmp.charAt(i) == '*' || tmp.charAt(i) == ('/')) {
				op.add(tmp.charAt(i) + "");
				break;
			}
		}
		StringTokenizer st = new StringTokenizer(tmp, "+|-|*|/");
		int oper1 = 0, oper2 = 0;
		while (st.hasMoreTokens()) {
			op.add(st.nextToken());
		}
		oper1 = Integer.parseInt(op.get(1));
		oper2 = Integer.parseInt(op.get(2));
		
		switch(op.get(0)) {
		case "+":
			System.out.println(oper1 + oper2);
			break;
		case "-":
			System.out.println(oper1 - oper2);
			break;
		case "*":
			System.out.println(oper1 * oper2);
			break;
		case "/":
			System.out.printf("%.2f", (double)oper1 / oper2);
			break;
		}
	}
}
