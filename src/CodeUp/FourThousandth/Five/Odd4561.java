package CodeUp.FourThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Odd4561 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0, min = 101;
		for (int i = 0, val = 0; i < 7; i++) {
			val = Integer.parseInt(br.readLine());
			if (val % 2 != 0) {
				sum += val;
				min = val >= min ? min : val;
			}
		}
		System.out.println(sum);
		System.out.println(min);
	}
}
