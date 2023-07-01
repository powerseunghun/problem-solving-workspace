package Acmicpc.As.B2.TenThousandth.Seven.Eight;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Command17838 {
	static final String bStr = "AABBABB";
	static Set<Character> set = new HashSet<>();
	static boolean check1(String str) {
		return str.length() == 7;
	}
	static boolean check2(String str) {
		set.clear();
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}
		return set.size() == 2;
	}
	static boolean check3(String str) {
//		char c1 = str.charAt(0);
//		char c2 = str.charAt(2);
//		boolean flag = c1 == c2;
//		
//		str = str.replaceAll(c1+"", "A").replaceAll(c2+"", "B");
//		
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i) != bStr.charAt(i)) return false;
//		}
//		
//		return flag; 
		return (str.charAt(0) == str.charAt(1) 
				&& (str.charAt(0) == str.charAt(4))) 
				&& (str.charAt(2) == str.charAt(3) 
				&& str.charAt(2) == str.charAt(5) 
				&& str.charAt(2) == str.charAt(6));
	}
	static boolean valid(String str) {
		return check1(str) && check2(str) && check3(str);
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		String str = null;
		
		while(T-- > 0) {
			str = br.readLine();
			sb.append(valid(str) ? "1" : "0").append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
