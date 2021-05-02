package CodeUp.Thousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpecialBallThrow1157 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double loc = Double.parseDouble(br.readLine());
		
		if (loc >= 50 && loc <= 60) {
			System.out.println("win");
		}
		else {
			System.out.println("lose");
		}
	}
}
