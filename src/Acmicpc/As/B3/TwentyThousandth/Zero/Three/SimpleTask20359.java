package Acmicpc.As.B3.TwentyThousandth.Zero.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleTask20359 {
	static int o = 1, p = 1;
	static void func(int N) {
		int res = 0;
		while (true) {
			res = (int)(o * Math.pow(2, p));
			if (res == N) return;
			if (res > N) {
				o++;
				p = 0;
				continue;
			}
			else p++;
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		func(N);
		
		System.out.println(o + " " + p);
		br.close();
	}
}
