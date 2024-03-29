package CodeUp.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SoundexSearchAlgorithm2043 {
	static String rule1(String s) {
		String result = "";
		result += s.charAt(0);
		for (int i = 1; i < s.length(); i++) {
			switch(s.charAt(i)) {
			case 'a': case 'e': case 'i': case 'o':
			case 'u': case 'h': case 'w': case 'y':
				result += "_";
				break;
			default:
				result += s.charAt(i);
				break;
			}
		}
		return result;
	}
	static String rule2(String s) {
		String result = "";
		result += s.charAt(0);
		
		for (int i = 1; i < s.length(); i++) {
			char tmp = s.charAt(i);
			result += tmp;
			if (result.length() == s.length()) break;
			for (int j = i + 1; j < s.length(); j++) {
				char tmp2 = s.charAt(j);
				if (tmp != tmp2) {
					i = j - 1;
					break;
				}
				else {
					result += "_";
					if (result.length() == s.length()) i = 100;
				}
			}
		}
		
		return result;
	}
	
	static String rule3(String s) {
		String result = "";
		result += s.charAt(0);
		for (int i = 1; i < s.length(); i++) {
			switch(s.charAt(i)) {
			case 'b': case 'f': case 'p': case 'v':
				result += "1";
				break;
			case 'c': case 'g': case 'j': case 'k':
			case 'q': case 's': case 'x': case 'z':
				result += "2";
				break;
			case 'd': case 't':
				result += "3";
				break;
			case 'l':
				result += "4";
				break;
			case 'm': case 'n':
				result += "5";
				break;
			case 'r':
				result += "6";
				break;
			default:
				result += s.charAt(i);
				break;
			}
		}
		return result;
	}
	
	static String rule4(String s) {
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != '_') result += s.charAt(i); 
		}
		int lv = 4 - result.length();
		if (result.length() < 4) {
			for (int i = 0; i < lv; i++) {
				result += "0";
			}
		}
		return result.substring(0, 4);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println(rule4(rule3(rule2(rule1(str)))));
	}
}
