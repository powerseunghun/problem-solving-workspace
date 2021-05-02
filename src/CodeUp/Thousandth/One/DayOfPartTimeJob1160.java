package CodeUp.Thousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DayOfPartTimeJob1160 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int d = Integer.parseInt(br.readLine());
		
		switch(d) {
		case 1: case 3: case 5: case 7:
			System.out.println("oh my god");
			break;
		default:
			System.out.println("enjoy");
			break;
		}
	}
}
