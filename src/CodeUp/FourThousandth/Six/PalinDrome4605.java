package CodeUp.FourThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PalinDrome4605 {
	static int count = 0;
	static String[] strs = null;
	static Map<String, Boolean> mem = new HashMap<>();
	static boolean check(String str) {
		for (int i = 0, j = str.length()-1; i < j; i++, j--) {
			if (str.charAt(i) != str.charAt(j)) return false;
		}
		return true;
	}
	static void bt(String str, int L) {
		if(mem.containsKey(str)) {
			count++;
			return;
		}
		if (str.length() > L) return;
		if (str.length() == L) {
			if(check(str)) {
				if (!mem.containsKey(str)) {
					mem.put(str, true);
				}
				count++;
			}
			return;
		}
		
		for (int i = 0; i < strs.length; i++) {
			bt(str.toString() + strs[i], L);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine().replaceAll(" ", ""));
		int L = Integer.parseInt(br.readLine().replaceAll(" ", ""));
		strs = new String[N];
		for (int i = 0; i < N; i++) {
			strs[i] = br.readLine().replaceAll(" ", "");
		}
		bt("", L);
		System.out.println(count);
	}
}
