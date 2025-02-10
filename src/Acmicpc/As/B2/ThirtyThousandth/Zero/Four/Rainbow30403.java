package Acmicpc.As.B2.ThirtyThousandth.Zero.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rainbow30403 {
	static boolean contains(String str, char c) {
		return str.length() - str.replace(c+"", "").length() != 0;
	}
	static boolean func(String str, int flag) {
		if (flag == 1) {
			return contains(str, 'R') && contains(str, 'O') && contains(str, 'Y') 
					&& contains(str, 'G') && contains(str, 'B') && contains(str, 'I') && contains(str, 'V');
		} else {
			return contains(str, 'r') && contains(str, 'o') && contains(str, 'y') && contains(str, 'g') 
					&& contains(str, 'b') && contains(str, 'i') && contains(str, 'v');
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String str = br.readLine();
		boolean flag1 = func(str, 1);
		boolean flag2 = func(str, 2);
		
		if (flag1 && flag2) {
			System.out.println("YeS");
		} else if (flag1 && !flag2) {
			System.out.println("YES");
		} else if (!flag1 && flag2) {
			System.out.println("yes");
		} else {
			System.out.println("NO!");
		}
		
		br.close();
	}
}
