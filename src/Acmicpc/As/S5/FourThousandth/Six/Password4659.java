package Acmicpc.As.S5.FourThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Password4659 {
	static Set<Character> vowels = new HashSet<>();
	static Set<Character> consonant = new HashSet<>();
	static void setInit() {
		for (char c='a'; c <= 'z'; c++) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vowels.add(c);
			}
			else consonant.add(c);
		}
	}
	static boolean func1(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (vowels.contains(str.charAt(i))) return true;
		}
		return false;
	}
	static boolean func2(String str) {
		int v = 0, c = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (vowels.contains(ch)) {
				c = c != 0 ? 0 : c;
				v++;
			}
			else {
				v = v != 0 ? 0 : v;
				c++;
			}
			if (v >= 3 || c >= 3) return false;
		}
		return true;
	}
	static boolean func3(String str) {
		for (int i = 0; i < str.length()-1; i++) {
			if (str.charAt(i) == str.charAt(i+1)) {
				if (!(str.charAt(i) == 'e' || str.charAt(i) == 'o')) return false;
			}
		}
		return true;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		setInit();
		
		while(true) {
			str = br.readLine();
			if (str.equals("end")) break;
			
			sb.append("<").append(str).append("> is ");
			sb.append((func1(str) && func2(str) && func3(str)) ? "acceptable." : "not acceptable.").append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
