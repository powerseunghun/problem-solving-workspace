package Acmicpc.As.B2.NineThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GoblinWord9226 {
	static Set<Character> bowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
	static String func(String str) {
		StringBuilder sb = new StringBuilder();
		char c = ' ';
		int idx = -1;
		
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if (bowels.contains(c)) {
				idx = i;
				break;
			}
		}
		
		if (idx == 0 || idx == -1) {
			sb.append(str);
		}
		else {
			sb.append(str.substring(idx, str.length()));
			sb.append(str.substring(0, idx));
		}
		
		return sb.append("ay").toString();
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		
		while(true) {
			str = br.readLine();
			if (str.equals("#")) break;
			if (!sb.toString().equals("")) sb.append("\n");
			
			sb.append(func(str));
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
