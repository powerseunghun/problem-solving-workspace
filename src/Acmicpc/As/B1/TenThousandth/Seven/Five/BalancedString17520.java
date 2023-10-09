package Acmicpc.As.B1.TenThousandth.Seven.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BalancedString17520 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), res = 2;
		
		for (int i = 2; i <= N; i++) {
			res = i % 2 != 0 ? (res * 2) % 16769023 : res;
		}
		
		System.out.println(res);
		br.close();
	}
}
