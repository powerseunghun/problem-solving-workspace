package CodeUp.TwoThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class NumberStringFunction2024 {
	static void init(Map<Character, String> map) {
		map.put('1', "일"); map.put('4', "사"); map.put('7', "칠");
		map.put('2', "이"); map.put('5', "오"); map.put('8', "팔");
		map.put('3', "삼"); map.put('6', "육"); map.put('9', "구");
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] c = {"십억", "억", "천만", "백만", "십만", "만", "천", "백", "십"};
		String n = br.readLine();
		Map<Character, String> map = new HashMap<>();
		init(map);
		
		if(n.equals("0")) {
			System.out.println("영");
			return;
		}
		
		if (n.length() != 10) {
			StringBuilder tmp = new StringBuilder();
			for (int i = 0; i < 10 - n.length(); i++) tmp.append("0");
			tmp.append(n);
			n = tmp.toString();
		}
		
		for (int i = 0; i < n.length(); i++) {
			if (n.charAt(i) != '0' && i != n.length()-1) {
				if (i == 0 || i == 4) {
					if (n.charAt(i+1) == '0') {
						System.out.print(map.get(n.charAt(i)) + c[i]);
					}
					else {
						System.out.print(map.get(n.charAt(i)) + c[i].charAt(0));
						System.out.print(map.get(n.charAt(i+1)) + c[i++].charAt(1));
					}
				}
				else if (i == 2 || i == 3) {
					if (n.charAt(i+1) == '0') {
						System.out.print(map.get(n.charAt(i)) + c[i]);
					}
					else System.out.print(map.get(n.charAt(i)) + c[i].charAt(0));
				}
				else {
					System.out.print(map.get(n.charAt(i)) + c[i]);
				}
			}
			else if (n.charAt(i) != '0' && i == n.length()-1) {
				System.out.println(map.get(n.charAt(i)));
			}
		}
	}
}
