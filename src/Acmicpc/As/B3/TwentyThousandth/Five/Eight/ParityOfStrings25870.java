package Acmicpc.As.B3.TwentyThousandth.Five.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class ParityOfStrings25870 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Map<Character, Integer> map = new HashMap<>();
		char ch = ' ';
		boolean check = true;
		int res = Integer.MAX_VALUE, tmp = 0;
		
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		for (Character c : map.keySet()) {
			tmp = map.get(c) % 2;
			if (res == Integer.MAX_VALUE) {
				res = tmp;
				continue;
			}
			if (res != tmp) {
				check = false;
				break;
			}
		}
		
		System.out.println(!check ? 2 : res);
		br.close();
	}
}
