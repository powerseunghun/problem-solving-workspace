package CodeUp.ThreeThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LeastCommonMultiple3005 {
	static int GCD(int a, int b) {
		if (b % a == 0) return a;
		else return GCD(b%a, a);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int lcm = 1, tmp = 0;
		
		while(st.hasMoreTokens()) {
			tmp = Integer.parseInt(st.nextToken());
			lcm = (lcm * tmp) / GCD(tmp, lcm);
		}
		System.out.println(lcm);
	}
}
