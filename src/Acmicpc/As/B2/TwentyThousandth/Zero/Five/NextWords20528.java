package Acmicpc.As.B2.TwentyThousandth.Zero.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NextWords20528 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		String b = st.nextToken(), s = null;
		boolean flag = true;
		
		while(flag && st.hasMoreTokens()) {
			s = st.nextToken();
			if (b.charAt(0) != s.charAt(0)) flag = false;
		}
		
		System.out.println(flag ? "1" : "0");
		br.close();
	}
}
