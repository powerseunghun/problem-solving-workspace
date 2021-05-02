package CodeUp.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrdinalNumberExpression1204 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String exp = null;
		switch(n % 10) {
		case 1:
			exp = n / 10 == 1 ? "th" : "st";
			break;
		case 2:
			exp = n / 10 == 1 ? "th" : "nd";
			break;
		case 3:
			exp = n / 10 == 1 ? "th" : "rd";
			break;
		default:
			exp = "th";
			break;
		}
		System.out.println(n + exp);
	}
}
