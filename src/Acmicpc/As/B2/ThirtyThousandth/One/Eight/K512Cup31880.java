package Acmicpc.As.B2.ThirtyThousandth.One.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class K512Cup31880 {
	static int[] a = null, b = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = null;
		int N = Integer.parseInt(str.split(" ")[0]);
		int M = Integer.parseInt(str.split(" ")[1]);
		long res = 0;
		a = new int[N];
		b = new int[M];
		
		for (int i = 0, idx = 0; i < 2; i++, idx=0) {
			st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				if (i == 0) {
					a[idx++] = Integer.parseInt(st.nextToken());
				} else {
					b[idx++] = Integer.parseInt(st.nextToken());
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			res += a[i];
		}
		for (int i = 0; i < b.length; i++) {
			if (b[i] == 0) continue;
			res *= b[i];
		}
		
		System.out.println(res);
		br.close();
	}
}
