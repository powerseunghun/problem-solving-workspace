package CodeUp.Basic100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Synthesis1078 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), sum = 0;
		
		for (int i = 1; i <= n; i++) {
			sum = i % 2 == 0 ? sum += i : sum;
		}
		
		System.out.println(sum);
	}
}
