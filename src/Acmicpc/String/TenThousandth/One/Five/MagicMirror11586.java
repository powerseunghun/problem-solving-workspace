package Acmicpc.String.TenThousandth.One.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MagicMirror11586 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), K = 0;
		String[] str = new String[N];
		
		for (int i = 0; i < str.length; i++) {
			str[i] = br.readLine();
		}
		K = Integer.parseInt(br.readLine());
		
		switch(K) {
		case 1:
			for (int i = 0; i < str.length; i++) {
				System.out.println(str[i]);
			}
			break;
		case 2:
			for (int i = 0; i < str.length; i++) {
				for (int j = str[i].length()-1; j >= 0; j--) {
					System.out.print(str[i].charAt(j));
				}
				System.out.println();
			}
			break;
		case 3:
			for (int i = str.length-1; i >= 0; i--) {
				System.out.println(str[i]);
			}
			break;
		}
	}
}
