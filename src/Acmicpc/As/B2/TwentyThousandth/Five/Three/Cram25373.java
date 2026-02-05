package Acmicpc.As.B2.TwentyThousandth.Five.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cram25373 {
	static int func(long N) {
		if (N <= 1) return 1;
		else if (N <= 3) return 2;
		else if (N <= 6) return 3;
		else if (N <= 10) return 4;
		else if (N <= 15) return 5;
		else if (N <= 21) return 6;
		return 7;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Long.parseLong(br.readLine());
		long res = N/7;
		
		if (N <= 28) {
			res = func(N);
		} else {
			while ((res-3)*7 < N) {
				res++;
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
