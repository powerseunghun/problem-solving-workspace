package Acmicpc.As.B3.SixThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PerfectSquareNumber6131 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), count = 0;;
		
		for (int i = 1; i <= 500; i++) {
			for (int j = 1; j <= 500; j++) {
				if (i == j) continue;
				if (Math.pow(i, 2) - N == Math.pow(j, 2)) count++;
			}
		}
		
		System.out.println(count);
		br.close();
	}
}
