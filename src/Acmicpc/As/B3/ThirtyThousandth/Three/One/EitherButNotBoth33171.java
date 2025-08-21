package Acmicpc.As.B3.ThirtyThousandth.Three.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EitherButNotBoth33171 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine()), res = 0;
		
		for (int i = 1; i <= N; i++) {
			if ((i % A == 0) ^ (i % B == 0)) {
				res++;
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
