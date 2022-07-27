package Acmicpc.As.B3.TenThousandth.One.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Tawla11800 {
	static Map<Integer, String> map = new HashMap<>();
	static String[] strs = {"", "Yakk", "Doh", "Seh", "Ghar", "Bang", "Sheesh"};
	static String[] aStrs = {"", "Habb Yakk", "Dobara", "Dousa", "Dorgy", "Dabash", "Dosh"};
	static void mapInit() {
		for (int i = 1; i < strs.length; i++) {
			map.put(i, strs[i]);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		String tmp = null;
		mapInit();
		
		for (int i = 1, a = 0, b = 0; i <= T; i++) {
			tmp = br.readLine();
			a = Integer.parseInt(tmp.split(" ")[0]);
			b = Integer.parseInt(tmp.split(" ")[1]);
			sb.append("Case " + i + ": ");
			if (a == b) {
				sb.append(aStrs[a] + "\n");
			}
			else {
				if ((a==6 && b==5) || (a==5 && b==6)) {
					sb.append("Sheesh Beesh\n");
				}
				else sb.append(strs[Math.max(a, b)] + " " + strs[Math.min(a, b)] + "\n");
			}
		}
		System.out.print(sb.toString());
		br.close();
	}
}
