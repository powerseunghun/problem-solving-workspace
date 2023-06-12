package Acmicpc.As.B2.TenThousandth.Four.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberDigitTranslator14915 {
	static char[] cs = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
	static String func(int n, int m) {
		StringBuilder sb = new StringBuilder();
		if (n == 0) return "0";
		while (n != 0) {
			sb.append(cs[n % m]);
			n /= m;
		}
		return sb.reverse().toString();
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str.split(" ")[0]);
		int m = Integer.parseInt(str.split(" ")[1]);
		
		System.out.println(func(n, m));
		br.close();
	}
}
