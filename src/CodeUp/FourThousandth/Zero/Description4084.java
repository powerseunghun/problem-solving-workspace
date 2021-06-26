package CodeUp.FourThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Description4084 {
	static Map<Character, Integer> map = new HashMap<>();
	static void init() {
		for (char i = '0'; i <= '9'; i++) {
			map.put(i, i - '0');
		}
		
		int idx = 10;
		for (char i = 'A'; i <= 'Z'; i++) {
			map.put(i, idx++);
		}
	}
	static int hexToDecimal(String s) {
		int sum = 0;
		for (int i = s.length()-1, idx = 0; i >= 0; i--, idx++) {
			sum += Math.pow(16, idx) * map.get(s.charAt(i));
		}
		return sum;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringBuilder sb = new StringBuilder();
		init();
		
		if (str.charAt(0) == 'O' && str.charAt(str.length()-1) == 'X') {
			for (int i = 1; i < str.length()-1; i++) {
				sb.append(str.charAt(i));
			}
			String t = sb.reverse().toString();
			sb = new StringBuilder();
			for (int i = 0; i < t.length(); i+=2) {
				sb.append((char)(hexToDecimal(t.substring(i, i+2))));
			}
			System.out.println(sb.toString());
			return;
		}
		else {
			System.out.println("data error");
			return;
		}
	}
}
