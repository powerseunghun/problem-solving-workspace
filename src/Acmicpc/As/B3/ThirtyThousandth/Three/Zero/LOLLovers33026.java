package Acmicpc.As.B3.ThirtyThousandth.Three.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LOLLovers33026 {
	static boolean check(String str1, String str2) {
		int a = 0, b = 0;
		for (int i = 0; i < str1.length(); i++) {
			char c = str1.charAt(i);
			if (c == 'L') a++;
			else b++;
		}
		for (int i = 0; i < str2.length(); i++) {
			char c = str2.charAt(i);
			if (c == 'L') a--;
			else b--;
		}
		return a != 0 && b != 0;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String str = br.readLine();
		int res = -1;
		
		for (int i = 1; i < str.length(); i++) {
			if (check(str.substring(0, i), str.substring(i))) {
				res = i;
				break;
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
