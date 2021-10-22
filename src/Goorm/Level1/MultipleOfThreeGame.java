package Goorm.Level1;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class MultipleOfThreeGame {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= N; i++) {
			sb.append(i % 3 == 0 ? "X " : (i + " "));
		}
		System.out.print(sb.toString());
	}
}
