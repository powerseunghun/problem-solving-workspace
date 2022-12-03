package Acmicpc.As.B3.TwentyThousandth.Six.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Chronogram26198 {
	static Map<Character, Integer> map = new HashMap<>();
	static void mapInit() {
		int[] arr = {1, 5, 10, 50, 100, 500, 1000};
		char[] cArr = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
		for (int i = 0; i < arr.length; i++) {
			map.put(cArr[i], arr[i]);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), s = 0;
		String tmp = null;
		mapInit();
		
		while(T-- > 0) {
			tmp = br.readLine();
			s = 0;
			for (int i = 0; i < tmp.length(); i++) {
				s += map.containsKey(tmp.charAt(i)) ? map.get(tmp.charAt(i)) : 0;
			}
			sb.append(s + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
