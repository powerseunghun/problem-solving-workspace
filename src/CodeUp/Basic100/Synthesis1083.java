package CodeUp.Basic100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Synthesis1083 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine(), 16);
		
		// input limit under 10
		for (int i = 1; i <= n; i++) {
			if ((i % 10) % 3 == 0) System.out.print("X ");
			else {
				System.out.print(i + " ");
			}
		}
	}
}
