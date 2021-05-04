package CodeUp.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CatchCriminal1292 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int sum = 0;
		
		for (int i = 0; i < tmp.length(); i++) {
			sum += Integer.parseInt(tmp.charAt(i) + "");
		}
		
		if (sum % 7 == 4) System.out.println("suspect");
		else System.out.println("citizen");
	}
}
