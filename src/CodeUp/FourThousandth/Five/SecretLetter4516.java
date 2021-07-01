package CodeUp.FourThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class SecretLetter4516 {
	static String[] alpha = {"000000", "001111", "010011", "011100", "100110", "101001", "110101", "111010"};
	static Map<String, Character> getChar = new HashMap<>();
	static void init() {
		for (int i = 0; i < alpha.length; i++) {
			getChar.put(alpha[i], (char)(i+65));
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		StringBuilder sb = new StringBuilder();
		init();
		
		for (int i = 0, count = 0; i < str.length(); i += 6, count++) {
			String subs = str.substring(i, i+6);
			if (getChar.containsKey(subs)) {
				sb.append(getChar.get(subs));
				continue;
			}
			
			boolean flag = false;
			for (int j = 0; j < alpha.length; j++) {
				int cnt = 0;
				for (int k = 0; k < subs.length(); k++) {
					cnt = alpha[j].charAt(k) != subs.charAt(k) ? cnt + 1 : cnt;
				}
				if (cnt == 1) {
					flag = true;
					sb.append(getChar.get(alpha[j]));
				}
			}
			if (!flag) {
				System.out.println(count+1);
				return;
			}
		}
		System.out.println(sb.toString());
	}
}
