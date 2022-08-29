package Acmicpc.As.B3.TenThousandth.Five.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class YProgramming15667 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), K = 0;
		
		for (int i = 1; ; i++) {
			if (Math.pow(i, 1) + Math.pow(i, 2) + 1 == N) {
				K = i;
				break;
			}
		}
		
		System.out.println(K);
		br.close();
	}
}
