package Acmicpc.As.B3.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class HomeAddress1284 {
	static Map<Character, Integer> map = new HashMap<>();
	static void mapInit() {
		int val = 0;
		for (char c = '0'; c <= '9'; c++) {
			if (c == '0') val = 4;
			else if (c == '1') val = 2;
			else val = 3;
			map.put(c, val);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int sum = 0;
		
		mapInit();
		while (true) {
			tmp = br.readLine();
			if (tmp.charAt(0) == '0') break;
			sum = 0;
			
			for (int i = 0; i < tmp.length(); i++) {
				sum += map.get(tmp.charAt(i));
			}
			sum += tmp.length()+1;
			sb.append(sum + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
