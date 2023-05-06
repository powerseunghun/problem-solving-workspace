package Acmicpc.As.B2.TwentyThousandth.Seven.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class SchoolNameEncrypt27891 {
	static Map<Integer, String> map = new HashMap<>();
	static String[] strs = {
			"North London Collegiate School",
			"Branksome Hall Asia",
			"Korea International School",
			"St. Johnsbury Academy"
	};
	static void mapInit() {
		StringTokenizer st = null;
		String str = null;
		for (int i = 0; i < strs.length; i++) {
			st = new StringTokenizer(strs[i]);
			str = "";
			while (st.hasMoreTokens()) {
				str += st.nextToken().charAt(0);
			}
			map.put(i, str);
		}
	}
	static void func() {
		for (int i = 0; i < strs.length; i++) {
			strs[i] = strs[i].replaceAll("[^a-zA-Z]", "").toLowerCase();
			strs[i] = strs[i].substring(0, 10);
		}
	}
	static int check(String str) {
		boolean flag = false;
		for (int i = 0, base = 0; i < strs.length; i++) {
			base = (strs[i].charAt(0) - str.charAt(0));
			base = base < 0 ? base += 26 : base;
			flag = true;
			for (int j = 1, w = 0; j < str.length(); j++) {
				w = (strs[i].charAt(j) - str.charAt(j));
				w = w < 0 ? w += 26 : w;
				if (base != w) {
					flag = false;
					break;
				}
			}
			if (flag) return i;
		}
		return 5;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		mapInit();
		func();
		
		System.out.println(map.get(check(str)));
		br.close();
	}
}
