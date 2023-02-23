package Acmicpc.As.B2.FourThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class RefrigeratorMagnets4575 {
	static boolean check(String tmp) {
		Map<Character, Integer> map = new HashMap<>();
		char c = ' ';
		tmp = tmp.replaceAll(" ", "");
		for (int i = 0; i < tmp.length(); i++) {
			c = tmp.charAt(i);
			if (map.containsKey(c)) return false;
			map.put(c, 0);
		}
		return true;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		
		while(true) {
			tmp = br.readLine();
			if (tmp.equals("END")) break;
			
			sb.append(check(tmp) ? tmp+"\n" : "");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
