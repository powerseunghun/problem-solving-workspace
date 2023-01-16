package Acmicpc.As.B4.TwentyThousandth.Six.Seven;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class ZagubionaLitera26731 {
	static Map<Character, Integer> map = new HashMap<>();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char res = ' ';
		for (int i = 0; i < str.length(); i++) {
			map.put(str.charAt(i), 1);
		}
		
		for (char c = 'A'; c <= 'Z'; c++) {
			if (!map.containsKey(c)) {
				res = c;
				break;
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
