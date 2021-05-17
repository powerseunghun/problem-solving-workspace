package CodeUp.TwoThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class HexToBin2026 {
	static Map<Character, Integer> map = new HashMap<>();
	static void init() {
		map.put('0', 0); map.put('4', 4); map.put('8', 8); map.put('C', 12);
		map.put('1', 1); map.put('5', 5); map.put('9', 9); map.put('D', 13);
		map.put('2', 2); map.put('6', 6); map.put('A', 10); map.put('E', 14);
		map.put('3', 3); map.put('7', 7); map.put('B', 11); map.put('F', 15);
	}
	static int hexToNum(char c) {
		return map.get(c);
	}
	static String numToBin(int n) {
		StringBuilder sb = new StringBuilder();
		while (n != 0) {
			sb.append(n % 2);
			n/=2;
		}
		if (sb.toString().length() < 4) {
			for (int i = sb.toString().length(); i < 4; i++) sb.append("0");
		}
		
		return sb.reverse().toString();
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		init();
		
		for (int i = 0; i < tmp.length(); i++) {
			System.out.print(numToBin(hexToNum(tmp.charAt(i))) + " ");
		}
	}
}
