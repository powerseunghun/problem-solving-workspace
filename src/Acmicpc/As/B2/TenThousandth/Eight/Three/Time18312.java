package Acmicpc.As.B2.TenThousandth.Eight.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Time18312 {
	static boolean func(int v, int K) {
		return v % 10 == K || v / 10 == K;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int K = Integer.parseInt(tmp.split(" ")[1]), res = 0;
		
		for (int i = 0; i <= N; i++) {
			for (int j = 0; j < 60; j++) {
				for (int k = 0; k < 60; k++) {
					if (func(i, K) || func(j, K) || func (k, K)) res++;
				}
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
