package Acmicpc.As.B1.EightThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HiddenNumber8595 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String str = br.readLine();
		String[] tokens = str.split("[a-z]|[A-Z]");
		int res = 0;
		
		for (String s : tokens) {
			if (!s.equals("")) {
				res += Integer.parseInt(s);
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
