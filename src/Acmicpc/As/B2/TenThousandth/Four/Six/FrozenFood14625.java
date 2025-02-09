package Acmicpc.As.B2.TenThousandth.Four.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FrozenFood14625 {
	static boolean func(int h, int m, int n) {
		return h%10 == n || h/10 == n || m/10 == n || m%10 == n;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int h1 = Integer.parseInt(str.split(" ")[0]);
		int m1 = Integer.parseInt(str.split(" ")[1]);
		str = br.readLine();
		int h2 = Integer.parseInt(str.split(" ")[0]);
		int m2 = Integer.parseInt(str.split(" ")[1]);
		int n = Integer.parseInt(br.readLine());
		int res = func(h2, m2, n) ? 1 : 0;
		
		while(h1 != h2 || m1 != m2) {
			if (func(h1, m1, n)) res++;
			m1++;
			h1 += m1/60;
			m1 %= 60;
		}
		
		System.out.println(res);
		br.close();
	}
}
