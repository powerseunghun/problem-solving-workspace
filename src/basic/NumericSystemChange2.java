package basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumericSystemChange2 {
	public String change(char c) {
		Map<Character, Integer> numeric = new HashMap<>();
		for (int i = 0; i < 16; i++) {
			if (i < 10) {
				numeric.put((char)(i + 48), i);
			}
			else {
				numeric.put((char)(i + 55), i);
			}
		}
		int n = numeric.get(c);
		String tmp = "", s = "";
		
		while(n != 0) {
			tmp += n % 2 + "";
			n /= 2;
		}
		tmp = new StringBuffer(tmp).reverse().toString();
		
		for (int i = 0; i < 4 - tmp.length(); i++) {
			s += "0";
		}
		s += tmp;
		
		return s;
	}
	public static void main(String[] args) {
		String s = new Scanner(System.in).nextLine();
		for (int i = 0; i < s.length(); i++) {
			System.out.print(new NumericSystemChange2().change(s.charAt(i)) + " ");
		}
	}
}
