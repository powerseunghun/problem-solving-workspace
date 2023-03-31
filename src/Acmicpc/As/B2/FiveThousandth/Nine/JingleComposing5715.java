package Acmicpc.As.B2.FiveThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

import Acmicpc.Sorting.TwoThousandth.Nine.FeequencySort2910;

public class JingleComposing5715 {
	static Map<Character, Double> map = new HashMap<>();
	static char[] identifiers = {'W', 'H', 'Q', 'E', 'S', 'T', 'X'};
	static void mapInit() {
		for (int i = 0, idx = 0; i < identifiers.length; i++) {
			map.put(identifiers[i], 1/Math.pow(2, idx++));
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		String str = null, tmp = null;
		int cnt = 0;
		double res = 0;
		mapInit();
		
		while(true) {
			str = br.readLine();
			if (str.equals("*")) break;
			cnt = 0;
			st = new StringTokenizer(str, "/");
			while (st.hasMoreTokens()) {
				tmp = st.nextToken();
				res = 0;
				for (int i = 0; i < tmp.length(); i++) {
					if (!map.containsKey(tmp.charAt(i))) continue;
					res += map.get(tmp.charAt(i));
				}
				if (res == 1) cnt++;
			}
			sb.append(cnt).append("\n");
		}
		System.out.print(sb.toString());
		br.close();
	}
}
