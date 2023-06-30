package Acmicpc.As.B2.TwentyThousandth.Six.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PhoneNumber26041 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String base = br.readLine(), p = null;
		int res = 0, ml = 0;
		
		while (st.hasMoreTokens()) {
			p = st.nextToken();
			ml = Math.min(base.length(), p.length());
			res = (!p.equals(base)) && (p.substring(0, ml).equals(base)) ? res + 1 : res;
		}
		
		System.out.println(res);
		br.close();
	}
}
