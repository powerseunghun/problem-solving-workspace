package CodeUp.Thousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpecialBallThrow1159 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int loc = Integer.parseInt(br.readLine());
		
		if ((loc >= 50 && loc <= 70) || (loc % 6 == 0)) {
			System.out.println("win");
		}
		else {
			System.out.println("lose");
		}
	}
}
