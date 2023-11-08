package Acmicpc.As.B5.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FactorialDecomposition2057 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Long.parseLong(br.readLine());
		long fact = 1, w = 1;
		boolean flag = true;
		
		while (N != fact) {
			if (fact > N/(++w)) {
				flag = false;
				break;
			}
			fact *= w;
		}
		
		System.out.println(flag ? "YES" : "NO");
		br.close();
	}
}
