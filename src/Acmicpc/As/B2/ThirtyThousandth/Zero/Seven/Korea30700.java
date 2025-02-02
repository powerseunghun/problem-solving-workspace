package Acmicpc.As.B2.ThirtyThousandth.Zero.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Korea30700 {
	static final String t = "KOREA";
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int res = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == t.charAt(res%t.length())) res++;
		}
		
		System.out.println(res);
		br.close();
	}
}
