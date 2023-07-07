package Acmicpc.As.B2.TwentyThousandth.One.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Palindrome21945 {
	static boolean check(String str) {
		for (int i = 0; i < str.length()/2; i++) {
			if (str.charAt(i) != str.charAt(str.length()-1-i)) return false;
		}
		return true;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		String str = null;
		long res = 0;
		
		while (st.hasMoreTokens()) {
			str = st.nextToken();
			res += check(str) ? Long.parseLong(str) : 0;
		}
		
		System.out.println(res);
		br.close();
	}
}
