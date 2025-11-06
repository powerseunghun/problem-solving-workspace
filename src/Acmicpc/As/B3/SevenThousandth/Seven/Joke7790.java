package Acmicpc.As.B3.SevenThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Joke7790 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		int res = 0;
		
		while((str = br.readLine()) != null) {
			for (int i = 3; i < str.length(); i++) {
				if (str.charAt(i-3) == 'j' && str.charAt(i-2) == 'o' && str.charAt(i-1) == 'k' && str.charAt(i) == 'e') {
					res++;
				}
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
