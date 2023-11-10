package Acmicpc.As.B5.TwoThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangle2622 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), res = 0;
		
		for (int i = 1; i < N; i++) {
			for (int j = i, t = 0; j < N; j++) {
				t = N-i-j;
				if (j > t) break;
				res = i+j>t ? res + 1 : res;
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
