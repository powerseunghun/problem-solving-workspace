package Acmicpc.As.B3.TwentyThousandth.Zero.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SomeSum21185 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		System.out.println(N%2 != 0 ? "Either" : (N/2)%2 != 0 ? "Odd" : "Even");
		br.close();
	}
}
