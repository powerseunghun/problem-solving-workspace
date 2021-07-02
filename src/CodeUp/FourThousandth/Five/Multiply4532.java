package CodeUp.FourThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiply4532 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine()), b = Integer.parseInt(br.readLine());
		int tmp = b;
		
		while (tmp != 0) {
			System.out.println(a * (tmp % 10));
			tmp /= 10;
		}
		System.out.println(a * b);
	}
}
