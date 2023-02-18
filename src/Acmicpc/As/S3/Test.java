package Acmicpc.As.S3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Test {
	static final int TC = 4;
	static Map<String, String> map = new HashMap<>();
	static void mapInit() {
		String[] strs = {"zero" ,"one" ,"two", "three", "four", 
				"five", "six", "seven", "eight", "nine"};
		for (int i = 0; i < strs.length; i++) {
			map.put(strs[i], String.valueOf(i));
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		mapInit();
		
		for (int i = 0; i < TC; i++) {
			str = br.readLine();
			for (String rStr : map.keySet()) {
				str = str.replace(rStr, map.getOrDefault(rStr, "ERROR"));
			}
			sb.append(str).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
