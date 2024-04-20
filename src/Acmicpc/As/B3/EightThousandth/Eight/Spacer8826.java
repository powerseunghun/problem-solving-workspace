package Acmicpc.As.B3.EightThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Spacer8826 {
	static Map<Character, Integer> map = new HashMap<Character, Integer>();
	static final char[] arr = new char[] {'N', 'S', 'W', 'E'};
	static void mapInit() {
		map.clear();
		for (char c : arr) {
			map.put(c, 0);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int Z = Integer.parseInt(br.readLine());
		String str = null;
		
		while(Z-- > 0) {
			br.readLine();
			str = br.readLine();
			mapInit();
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				map.put(c, map.getOrDefault(c, 0)+1);
			}
			sb.append(Math.abs(map.get(arr[0])-map.get(arr[1]))+Math.abs(map.get(arr[2])-map.get(arr[3]))).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
