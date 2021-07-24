package Acmicpc.Implements.TenThousandth.One.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Set11723 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Integer> set = new HashMap<>();
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int M = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < M; i++) {
			tmp = br.readLine();
			if (tmp.equals("all")) {
				set.clear();
				for (int j = 1; j <= 20; j++) {
					set.put(j+"", 1);
				}
			}
			else if (tmp.equals("empty")) {
				set.clear();
			}
			else {
				String x = tmp.split(" ")[1];
				switch(tmp.split(" ")[0]) {
				case "add":
					if (!set.containsKey(x)) {
						set.put(x, 1);
					}
					break;
				case "remove":
					if (set.containsKey(x)) {
						set.remove(x);
					}
					break;
				case "check":
					if (set.containsKey(x)) sb.append("1\n");
					else sb.append("0\n");
					break;
				case "toggle":
					if (set.containsKey(x)) set.remove(x);
					else set.put(x, 1);
					break;
				}
			}
		}
		System.out.print(sb.toString());
	}
}
