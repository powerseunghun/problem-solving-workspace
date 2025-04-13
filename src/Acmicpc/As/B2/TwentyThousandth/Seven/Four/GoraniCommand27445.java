package Acmicpc.As.B2.TwentyThousandth.Seven.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoraniCommand27445 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]), T1 = 50;
		int M = Integer.parseInt(str.split(" ")[1]), T2 = 50, v = 0;
		int r = 1, c = 1;
		
		for (int i = 1; i < N; i++) {
			v = Integer.parseInt(br.readLine());
			if (v < T1) {
				r = i;
				T1 = v;
			}
		}
		str = br.readLine();
		v = Integer.parseInt(str.split(" ")[0]);
		if (v < T1) {
			r = N;
		}
		T2 = v;
		
		for (int i = 2; i <= M; i++) {
			v = Integer.parseInt(str.split(" ")[i-1]);
			if (v < T2) {
				c = i;
				T2 = v;
			}
		}
		
		System.out.println(r + " " + c);
		br.close();
	}
}
