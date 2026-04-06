package Acmicpc.As.B2.TenThousandth.Five.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Davor15494 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), a = 0, b = 0;
		
		for (int i = 1; i <= 100&&i*364<N; i++) {
			if ((N/52-i*7) % 21 != 0) continue;
			a = i;
			b = (N/52-i*7) / 21;
		}
		
		System.out.println(a);
		System.out.println(b);
		br.close();
	}
}
