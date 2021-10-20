package Goorm.Level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumberOfSquare {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		long tmp = n * (n + 1) * (2 * n + 1);
		
		// sigma k^2
		System.out.println(tmp / 6);
	}
}
