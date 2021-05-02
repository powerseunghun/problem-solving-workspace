package CodeUp.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BMIDistinction1203 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int b = Integer.parseInt(br.readLine());
		
		if (b <= 10) {
			System.out.println("정상");
		}
		else if (b <= 20) {
			System.out.println("과체중");
		}
		else {
			System.out.println("비만");
		}
	}
}
