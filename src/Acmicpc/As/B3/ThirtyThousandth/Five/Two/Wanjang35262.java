package Acmicpc.As.B3.ThirtyThousandth.Five.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Wanjang35262 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine(), w = br.readLine();
		int K = Integer.parseInt(str.split(" ")[1]), cnt = 0;
		boolean flag = true;
		
		for (int i = 0; i < w.length() && flag; i++) {
			char c = w.charAt(i);
			if (c == '0') {
				cnt++;
			} else {
				cnt = 0;
			}
			if (cnt == K) {
				flag = false;
			}
		}
		
		System.out.println(!flag ? "0" : "1");
		br.close();
	}
}
