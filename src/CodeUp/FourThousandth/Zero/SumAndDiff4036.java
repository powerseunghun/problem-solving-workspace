package CodeUp.FourThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumAndDiff4036 {
	// n^2 .. input 1,000,000 -> 10,000,000,000
	// use simultaneous equation .. (n+m) is odd
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		System.out.println((n + m) / 2);
		System.out.println(n - ((n + m) / 2));
	}
}
