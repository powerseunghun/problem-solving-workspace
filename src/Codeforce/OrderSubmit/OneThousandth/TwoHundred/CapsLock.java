package Codeforce.OrderSubmit.OneThousandth.TwoHundred;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CapsLock {
	static boolean check(String str) {
		if (str.equals(str.toUpperCase())) {
			return false;
		}
		if (str.charAt(0) >= 'a' && str.charAt(0) <= 'z') {
			if (str.length()==1) return false;
			else {
				String tmp = str.substring(1, str.length());
				if (tmp.equals(tmp.toUpperCase())) return false;
			}
		}
		return true;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		
		if (check(str)) sb.append(str);
		else {
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				if (c >= 'a' && c <= 'z') {
					sb.append((char)(c-32));
				}
				else {
					sb.append((char)(c+32));
				}
			}
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
