package Acmicpc.As.B2.TwentyThousandth.One.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SilentAution21613 {
	static class A implements Comparable<A>{
		public String n;
		public int p;
		
		public A(String n, int p) {
			this.n = n;
			this.p = p;
		}

		@Override
		public int compareTo(A o) {
			return o.p - this.p;
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()), p = 0;
		String str = null;
		A[] as = new A[T];
		
		for (int i = 0; i < T; i++) {
			str = br.readLine();
			p = Integer.parseInt(br.readLine());
			as[i] = new A(str, p);
		}
		Arrays.sort(as);
		
		System.out.println(as[0].n);
		br.close();
	}
}
