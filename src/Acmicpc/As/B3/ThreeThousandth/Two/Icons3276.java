package Acmicpc.As.B3.ThreeThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Icons3276 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), min = Integer.MAX_VALUE, tmp = 0;
		int r = 0, c = 0;
		
		for (int i = 1; i <= N; i++) {
			if (N % i == 0) {
				tmp = N / i;
			}
			else tmp = N / i + 1;
			if (i + tmp < min) {
				r = i;
				c = tmp;
				min = i + tmp;
			}
		}
		System.out.println(r + " " + c);
		br.close();
	}
}
