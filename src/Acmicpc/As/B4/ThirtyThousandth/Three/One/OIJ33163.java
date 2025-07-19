package Acmicpc.As.B4.ThirtyThousandth.Three.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class OIJ33163 {
	static Map<Character, Character> map = new HashMap<>();
	static void mapInit() {
		map.put('J', 'O');
		map.put('O', 'I');
		map.put('I', 'J');
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		br.readLine();
		String str = br.readLine();
		mapInit();
		
		for (int i = 0; i < str.length(); i++) {
			sb.append(map.get(str.charAt(i)));
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
