package Acmicpc.As.B3.TenThousandth.Five.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dominos15236 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), cnt = 0;
		
		for (int i = 0; i <= N; i++) {
			for (int j = i; j <= N; j++) {
				cnt++;
			}
		}
		System.out.println(cnt*N);
		br.close();
	}
}
