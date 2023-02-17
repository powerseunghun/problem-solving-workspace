package Acmicpc.As.B2.FourThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Numbersrebmun4141 {
	static Map<Character, Integer> map = new HashMap<>();
	static void mapInit() {
		String[] strs = {"", "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
		for (int i = 2; i < strs.length; i++) {
			for (int j = 0; j < strs[i].length(); j++) {
				map.put(strs[i].charAt(j), i);
				map.put((char)(strs[i].charAt(j)+32), i);
			}
		}
	}
	static String getNums(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if(map.containsKey(str.charAt(i))) {
				sb.append(map.get(str.charAt(i)));
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(), tmpSb = null;
		int T = Integer.parseInt(br.readLine());
		String str = null;
		
		mapInit();
		while(T-- > 0) {
			str = br.readLine();
			sb.append(getNums(str).equals(new StringBuilder(getNums(str)).reverse().toString()) ? "YES" : "NO").append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
