package Acmicpc.As.B3.EightThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Liczba8658 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 2; i <= n; i++) {
			if (n % i == 0) continue;
			sb.append(i + " ");
			break;
		}
		for (int i = n-1; i >= 2; i--) {
			if (n % i == 0) continue;
			sb.append(i + "\n");
			break;
		}
		System.out.print(sb.toString());
		br.close();
	}
}
