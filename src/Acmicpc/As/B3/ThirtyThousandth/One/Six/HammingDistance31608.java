package Acmicpc.As.B3.ThirtyThousandth.One.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HammingDistance31608 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int res = 0;
		br.readLine();
		String s = br.readLine();
		String t = br.readLine();
		
		for (int i = 0; i < Math.min(s.length(), t.length()); i++) {
			if (s.charAt(i) != t.charAt(i)) res++;
		}
		
		System.out.println(res);
		br.close();
	}
}
