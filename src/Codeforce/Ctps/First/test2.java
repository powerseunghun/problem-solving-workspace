package Codeforce.Ctps.First;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class test2 {
	static Map<Integer, Integer> map = new HashMap<>();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine()), n = 0, max = 0;
		boolean flag = false;
		StringTokenizer st = null;
		
		for (int i = 0; i < t; i++) {
			n = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			flag = false;
			max = 0;
			map.clear();
			for (int j = 0, val = 0; j < n; j++) {
				val = Integer.parseInt(st.nextToken());
				if (!map.containsKey(val)) {
					map.put(val, 1);
				}
				else {
					map.put(val, map.get(val)+1);
					if (map.get(val) >= 3 && val > max) {
						flag = true;
						max = val;
					}
				}
			}
			if (!flag) sb.append("-1\n");
			else sb.append(max+"\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
