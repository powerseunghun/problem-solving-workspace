package CodeUp.Thousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AgeCalc1168 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = 0;
		
		switch(tmp.charAt(7)) {
		case '3': case '4':
			n += 2000 + (Integer.parseInt(tmp.charAt(0)+"" + tmp.charAt(1)+""));
			break;
		default:
			n += 1900 + (Integer.parseInt(tmp.charAt(0)+"" + tmp.charAt(1)+""));
			break;
		}
		System.out.println(2012 - n + 1);
	}
}
