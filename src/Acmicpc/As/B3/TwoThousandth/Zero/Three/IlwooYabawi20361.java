package Acmicpc.As.B3.TwoThousandth.Zero.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IlwooYabawi20361 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int X = Integer.parseInt(tmp.split(" ")[1]);
		int K = Integer.parseInt(tmp.split(" ")[2]);
		
		for (int i = 0, A = 0, B = 0; i < K; i++) {
			tmp = br.readLine();
			A = Integer.parseInt(tmp.split(" ")[0]);
			B = Integer.parseInt(tmp.split(" ")[1]);
			if (A == X) {
				X = B;
			}
			else if (B == X) {
				X = A;
			}
		}
		System.out.println(X);
		br.close();
	}
}
