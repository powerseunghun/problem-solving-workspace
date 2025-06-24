package Acmicpc.As.B2.SixThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class AromaticNumbers6769 {
	static Map<Character, Integer> map = new HashMap<>();
	static void mapInit() {
		map.put('I', 1); map.put('V', 5); map.put('X', 10); map.put('L', 50);
		map.put('C', 100); map.put('D', 500); map.put('M', 1000);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int res = 0;
		
		mapInit();
		for (int i = 0; i < str.length(); i+=2) {
			res += (str.charAt(i)-'0') * map.get(str.charAt(i+1)) * (i+2<str.length() && map.get(str.charAt(i+1)) < map.get(str.charAt(i+3)) ? -1 : 1);
		}
		
		System.out.println(res);
		br.close();
	}
}
