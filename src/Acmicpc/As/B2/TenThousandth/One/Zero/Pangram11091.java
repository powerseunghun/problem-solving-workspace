package Acmicpc.As.B2.TenThousandth.One.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Pangram11091 {
	static Map<Character, Integer> map = new HashMap<>();
	static StringBuilder printSb = null;
	static final char[] arr = new char[]{
		'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 
		'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
	};
	static boolean check(String str) {
		boolean flag = true;
		
		map.clear();
		for (int i = 0; i < str.length(); i++) {
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
		}
		printSb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				printSb.append(arr[i]);
				flag = false;
			}
		}
		
		return flag;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String str = null;
		
		while(N-- > 0) {
			str = br.readLine().toLowerCase();
			sb.append(check(str) ? "pangram" : "missing " + printSb.toString()).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
