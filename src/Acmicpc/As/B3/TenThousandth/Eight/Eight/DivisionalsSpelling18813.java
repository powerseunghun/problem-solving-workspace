package Acmicpc.As.B3.TenThousandth.Eight.Eight;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class DivisionalsSpelling18813 {
	static boolean check(String str, char l) {
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) > l) return false;
			if (!map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), 1);
				continue;
			}
			return false;
			
		}
		return true;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int m = Integer.parseInt(tmp.split(" ")[1]), cnt = 0;
		char l = (char)(65+m-1);
		
		for (int i = 0; i < n; i++) {
			tmp = br.readLine();
			if (check(tmp, l)) cnt++;
		}
		
		System.out.println(cnt);
		br.close();
	}
}
