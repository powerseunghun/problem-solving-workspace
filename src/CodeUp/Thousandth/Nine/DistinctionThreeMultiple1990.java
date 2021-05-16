package CodeUp.Thousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DistinctionThreeMultiple1990 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int sum = 0;
		
		for (int i = 0; i < tmp.length(); i++) {
			sum += tmp.charAt(i) - 48;
		}
		
		if (sum % 3 == 0) System.out.println("1");
		else System.out.println("0");
	}
}
