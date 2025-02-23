package Acmicpc.As.B2.TenThousandth.Three.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChopCup13224 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int a = 1, b = 0, c = 0;
		
		for (int i = 0, tmp = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			switch(ch) {
			case 'A':
				tmp = a; a = b; b = tmp;
				break;
			case 'B':
				tmp = b; b = c; c = tmp;
				break;
			case 'C':
				tmp = c; c = a; a = tmp;
				break;
			}
		}
		System.out.println(a > 0 ? 1 : b > 0 ? 2 : 3);
		br.close();
	}
}
