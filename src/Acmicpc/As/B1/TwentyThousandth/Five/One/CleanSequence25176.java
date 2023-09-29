package Acmicpc.As.B1.TwentyThousandth.Five.One;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CleanSequence25176 {
	static int func(int N) {
		if (N == 1) return 1;
		else return N * func(N-1);
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(func(N));
		br.close();
	}
}
