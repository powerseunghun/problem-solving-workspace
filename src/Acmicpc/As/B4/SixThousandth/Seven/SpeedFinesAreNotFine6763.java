package Acmicpc.As.B4.SixThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpeedFinesAreNotFine6763 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder("You are speeding and your fine is $");
		int base = Integer.parseInt(br.readLine());
		int sp = Integer.parseInt(br.readLine());
		int diff = sp - base, F = 0;
		
		if (diff <= 0) {
			System.out.println("Congratulations, you are within the speed limit!");
			return;
		}
		else if (diff <= 20) {
			F = 100;
		}
		else if (diff <= 30) {
			F = 270;
		}
		else F = 500;
		sb.append(F + ".\n");
		System.out.print(sb.toString());
		
		br.close();
	}
}
