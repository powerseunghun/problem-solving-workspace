package Acmicpc.As.B2.TwentyThousandth.Nine.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loetamatutekst29945 {
	static String[] strs = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), t = 0;
		strs = new String[N];
		String v = null;
		
		for (int i = 0; i < strs.length; i++) {
			strs[i] = br.readLine();
		}
		v = br.readLine().replaceAll("[^a-z]", "");
		
		for (int i = 0; i < strs.length; i++) {
			if (strs[i].contains(v)) {
				t++;
				sb.append(strs[i]).append("\n");
			}
		}
		
		System.out.println(t);
		System.out.print(sb.toString());
		br.close();
	}
}
