package Acmicpc.NumberTheory.TwoThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pascal2986 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), counter = 0;
		
		for (int i = N-1; i >= 1; i--) {
			counter += 1;
			if (N % i == 0) break;
		}
		System.out.println(counter);
	}
}
