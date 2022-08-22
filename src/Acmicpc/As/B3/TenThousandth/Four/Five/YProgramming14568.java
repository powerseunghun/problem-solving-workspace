package Acmicpc.As.B3.TenThousandth.Four.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class YProgramming14568 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		
		for (int i = 1; i <= N; i++) {
			for (int j = N-i, k = 0; j >= 1; j--) {
				if (i % 2 != 0) continue;
				k = N - (i + j);
				if (k == 0) continue;
				if (k-2 < j) continue;
				count++;
			}
		}
		
		System.out.println(count);
		br.close();
	}
}
