package CodeUp.Thousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InspectionProduct1674 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int sum = 0;
		for (int i = 0; i < tmp.length(); i++) {
			sum += (tmp.charAt(i) - '0');
		}
		if (sum % 7 == 4) System.out.println("Bad");
		else System.out.println("Good");
	}
}
