package CodeUp.TwoThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NineTwoPM2744 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = 1;
		
		for (int i = n; i > (n-4); i--) {
			m *= i;
		}
		
		System.out.println(m);
	}
}
