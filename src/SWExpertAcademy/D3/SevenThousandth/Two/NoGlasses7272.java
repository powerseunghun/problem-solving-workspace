package SWExpertAcademy.D3.SevenThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class NoGlasses7272 {
	static Map<Character, Integer> map = new HashMap<>();
	static void mapInit() {
		map.put('B', 1);
		map.put('A', 2); map.put('D', 2); map.put('O', 2);
		map.put('P', 2); map.put('Q', 2); map.put('R', 2);
		for (char c = 'A'; c <= 'Z'; c++) {
			if (!map.containsKey(c)) map.put(c, 3);
		}
	}
	static boolean check(String A, String B) {
		for (int i = 0; i < A.length(); i++) {
			if (map.get(A.charAt(i)) != map.get(B.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null, A = null, B = null;
		mapInit();
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= T; i++) {
			tmp = br.readLine();
			A = tmp.split(" ")[0];
			B = tmp.split(" ")[1];
			if (A.length() != B.length()) {
				sb.append("#" + i + " DIFF\n");
				continue;
			}
			if (check(A, B)) sb.append("#" + i + " SAME\n");
			else sb.append("#" + i + " DIFF\n");
		}
		System.out.print(sb.toString());
	}
}
