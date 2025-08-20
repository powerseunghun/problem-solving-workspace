package Acmicpc.As.B3.ThirtyThousandth.Three.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RSP33167 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String str1 = br.readLine();
		String str2 = br.readLine();
		int w1 = 0, w2 = 0;
		
		for (int i = 0; i < Math.min(str1.length(), str2.length()); i++) {
			char c1 = str1.charAt(i);
			char c2 = str2.charAt(i);
			
			switch(c1) {
			case 'R':
				if (c2 == 'S') {
					w1++;
				} else if (c2 == 'P') {
					w2++;
				}
				break;
			case 'S':
				if (c2 == 'R') {
					w2++;
				} else if (c2 == 'P') {
					w1++;
				}
				break;
			case 'P':
				if (c2 == 'R') {
					w1++;
				} else if (c2 == 'S') {
					w2++;
				}
				break;
			}
		}
		
		System.out.println(w1 + " " + w2);
		br.close();
	}
}
