package Acmicpc.As.B2.TenThousandth.Eight.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Speeding18154 {
	static int[] t = null, d = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), res = 0;
		String str = null;
		t = new int[N];
		d = new int[N];
		for (int i = 0; i < N; i++) {
			str = br.readLine();
			t[i] = Integer.parseInt(str.split(" ")[0]);
			d[i] = Integer.parseInt(str.split(" ")[1]);
		}
		
		for (int i = 1; i < N; i++) {
			res = Math.max(res, (d[i]-d[i-1])/(t[i]-t[i-1]));
		}
		
		System.out.println(res);
		br.close();
	}
}
