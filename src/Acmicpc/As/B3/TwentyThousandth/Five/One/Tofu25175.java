package Acmicpc.As.B3.TwentyThousandth.Five.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tofu25175 {
	static int func(int A, int B) {
		while (A < 0) {
			A += B;
		}
		return A % B;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		int K = Integer.parseInt(tmp.split(" ")[2]);
		int v = 0;
		
		while (K < 0) {
			K += N;
		}
		v = func(K-3, N) + M;
		
		System.out.println(v > N ? v%N : v);
		br.close();
	}
}
