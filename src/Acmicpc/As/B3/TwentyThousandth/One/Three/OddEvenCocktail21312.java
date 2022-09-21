package Acmicpc.As.B3.TwentyThousandth.One.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OddEvenCocktail21312 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int res = 1, evenRes = 1, val = 0;
		boolean flag = false;
		
		while (st.hasMoreTokens()) {
			val = Integer.parseInt(st.nextToken());
			flag = !flag && val % 2 != 0 ? true : flag;
			evenRes *= val % 2 != 0 ? val : 1;
			res *= val;
		}
		
		System.out.println(flag ? evenRes : res);
		br.close();
	}
}
