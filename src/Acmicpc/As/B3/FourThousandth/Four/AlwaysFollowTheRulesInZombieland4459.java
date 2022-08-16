package Acmicpc.As.B3.FourThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class AlwaysFollowTheRulesInZombieland4459 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Map<Integer, String> map = new HashMap<>();
		int q = Integer.parseInt(br.readLine()), r = 0, n = 0;
		String str = null;
		
		for (int i = 1; i <= q; i++) {
			str = br.readLine();
			map.put(i, str);
		}
		r = Integer.parseInt(br.readLine());
		
		while (r-- > 0) {
			n = Integer.parseInt(br.readLine());
			sb.append("Rule " + n + ": " + (map.containsKey(n) ? map.get(n) : "No such rule"));
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
