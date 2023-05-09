package Acmicpc.As.B2.TenThousandth.Six.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreeMultiple16561 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 3 6 9
		// 0, 0, 1, 3, 6, 10
		// 0 1 2 3 4 5
		int N = Integer.parseInt(br.readLine()), res = 0;
		
		if (N == 3 || N == 6) {
			res = -1;
		}
		
		if (res == -1) {
			System.out.println(0);
		}
		else {
			N = (N-3) / 3;
			res = 0;
			for (int i = 0, w = 0; i < N; i++) {
				res += w;
				w++;
			}
			System.out.println(res);
		}
	
		br.close();
		
	}
}
