package Acmicpc.As.B2.ThirtyThousandth.Two.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberSequence32279 {
	static int func(int n, int p, int q, int r, int s, int a1) {
		if (n == 1) return a1;
		return (n&1) != 0 ? r*func(n/2,p,q,r,s,a1)+s : p*func(n/2,p,q,r,s,a1)+q;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int p = Integer.parseInt(str.split(" ")[0]);
		int q = Integer.parseInt(str.split(" ")[1]);
		int r = Integer.parseInt(str.split(" ")[2]);
		int s = Integer.parseInt(str.split(" ")[3]);
		int a1 = Integer.parseInt(br.readLine()), res = 0;
		
		for (int i = 1; i <= n; i++) {
			res += func(i, p, q, r, s, a1);
		}
		
		System.out.println(res);
		br.close();
	}
}
