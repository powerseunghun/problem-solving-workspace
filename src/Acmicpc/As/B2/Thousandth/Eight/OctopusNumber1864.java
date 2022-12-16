package Acmicpc.As.B2.Thousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class OctopusNumber1864 {
	static Map<Character, Integer> map = new HashMap<>();
	static void mapInit() {
		char[] chs = {'/', '-', '\\', '(', '@', '?', '>', '&', '%'};
		for (int i = 0; i < chs.length; i++) {
			map.put(chs[i], i-1);
		}
	}
	static int calc(String str) {
		int sum = 0, w = 0;
		for (int i = str.length()-1, val = 0; i >= 0; i--) {
			val = map.get(str.charAt(i));
			sum += (int)(val * Math.pow(8, w++));
		}
		return sum;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		mapInit();
		
		while (true) {
			str = br.readLine();
			if (str.equals("#")) break;
			sb.append(calc(str) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
