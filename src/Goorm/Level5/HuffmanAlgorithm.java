package Goorm.Level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class HuffmanAlgorithm {
	static char[] arr = null;
	static Map<Character, String> map = new HashMap<>();
	static String composeStr = null, res = "";
	static boolean flag = false;
	static void bt(int n, int d, String str) {
		if (flag) return;
		if (!composeStr.subSequence(0, str.length()).equals(str)) return;
		else {
			if (d >= n) {
				flag = true;
				for (int i = 0; i < arr.length; i++) {
					res += arr[i];
				}
				return;
			}
		}
		
		char c = map.containsKey('a') ? 'a' : 'A', l = (char)(c+5);
		for (; c < l; c++) {
			arr[d] = c;
			bt(n, d+1, str + map.get(c));
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int N = Integer.parseInt(br.readLine());
		arr = new char[N];
		
		for (int i = 0; i < N; i++) {
			tmp = br.readLine();
			map.put(tmp.split(" ")[0].charAt(0), tmp.split(" ")[1]);
		}
		composeStr = br.readLine();
		bt(N, 0, "");
		
		System.out.println(res);
		br.close();
	}
}
