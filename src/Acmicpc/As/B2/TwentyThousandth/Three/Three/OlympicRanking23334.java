package Acmicpc.As.B2.TwentyThousandth.Three.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OlympicRanking23334 {
	static class A implements Comparable<A> {
		public int a;
		public int b;
		public int c;
		String str;
		
		public A(int a, int b, int c, String str) {
			this.a = a;
			this.b = b;
			this.c = c;
			this.str = str;
		}

		@Override
		public int compareTo(A o) {
			if (this.a == o.a) {
				if (this.b == o.b) {
					return this.c - o.c;
				}
				else return this.b - o.b;
			}
			return this.a - o.a;
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()), a = 0, b = 0, c = 0;
		String str = null;
		
		while(T-- > 0) {
			str = br.readLine();
			a = Integer.parseInt(str.split(" ")[0]);
			b = Integer.parseInt(str.split(" ")[1]);
			c = Integer.parseInt(str.split(" ")[2]);
		}
		
	}
}
