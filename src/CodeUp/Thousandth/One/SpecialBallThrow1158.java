package CodeUp.Thousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpecialBallThrow1158 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int loc = Integer.parseInt(br.readLine());
		
		if ((loc >= 30 && loc <= 40) || (loc >= 60 && loc <= 70)) {
			System.out.println("win");
		}
		else {
			System.out.println("lose");
		}
	}
}
