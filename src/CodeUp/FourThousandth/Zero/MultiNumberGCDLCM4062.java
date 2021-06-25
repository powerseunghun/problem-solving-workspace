package CodeUp.FourThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MultiNumberGCDLCM4062 {
	static int GCD(int a, int b) {
		if (b == 0) return a;
		else return GCD(b, a%b);
	}
	static int LCM(int a, int b) {
		return a * b / GCD(a, b);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		int gcd = 0, lcm = 0, n1 = 0, n2 = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		n1 = Integer.parseInt(st.nextToken());
		n2 = Integer.parseInt(st.nextToken());
		gcd = GCD(n1, n2);
		lcm = LCM(n1, n2);
		
		while (st.hasMoreTokens()) {
			int t = Integer.parseInt(st.nextToken());
			gcd = GCD(gcd, t);
			lcm = LCM(lcm, t);
		}
		System.out.println(gcd);
		System.out.println(lcm);
	}
}
