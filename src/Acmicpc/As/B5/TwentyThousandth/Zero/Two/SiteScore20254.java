package Acmicpc.As.B5.TwentyThousandth.Zero.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SiteScore20254 {
	static int calc(int a, int b, int c, int d) {
		int tmp1 = 56 * a + 24 * b;
		int tmp2 = 14 * c + 6 * d;
		return tmp1 + tmp2;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int a = Integer.parseInt(tmp.split(" ")[0]);
		int b = Integer.parseInt(tmp.split(" ")[1]);
		int c = Integer.parseInt(tmp.split(" ")[2]);
		int d = Integer.parseInt(tmp.split(" ")[3]);
		
		System.out.println(calc(a, b, c, d));
		br.close();
	}
}
