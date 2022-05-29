package Acmicpc.As.B3.TwoThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Domino2921 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), sum = 0;
		
		for (int i = 0; i <= N; i++) {
			for (int j = i; j <= N; j++) {
				sum += (i + j);
			}
		}
		
		System.out.println(sum);
		br.close();
	}
}
