package Acmicpc.As.B2.ThirtyThousandth.Two.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hamburger32751 {
	static boolean func(String str, int a, int b, int c, int d) {
		if (str.charAt(0) != 'a' || str.charAt(str.length()-1) != 'a') return false;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i-1) == str.charAt(i)) return false;
		}
		
		for (int i = 0; i < str.length(); i++) {
			switch(str.charAt(i)) {
			case 'a':
				a--;
				break;
			case 'b':
				b--;
				break;
			case 'c':
				c--;
				break;
			case 'd':
				d--;
				break;
			}
		}
		return a >= 0 && b >= 0 && c >= 0 && d >= 0;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String str = br.readLine();
		int a = Integer.parseInt(str.split(" ")[0]);
		int b = Integer.parseInt(str.split(" ")[1]);
		int c = Integer.parseInt(str.split(" ")[2]);
		int d = Integer.parseInt(str.split(" ")[3]);
		str = br.readLine();
		
		System.out.println(func(str, a, b, c, d) ? "Yes" : "No");
		br.close();
	}
}
