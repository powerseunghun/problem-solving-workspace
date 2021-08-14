package Acmicpc.DataStructure.SevenThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class DualPriorityQueue7662 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		String command = null;
		TreeMap<Integer, Integer> map = null;
		int T = Integer.parseInt(br.readLine()), k = 0;
		
		for (int i = 0; i < T; i++) {
			map = new TreeMap<>();
			k = Integer.parseInt(br.readLine());
			for (int j = 0, val = 0; j < k; j++) {
				st = new StringTokenizer(br.readLine());
				command = st.nextToken();
				val = Integer.parseInt(st.nextToken());
				switch(command) {
				case "I":
					map.put(val, map.getOrDefault(val, 0)+1);
					break;
				case "D":
					if (map.isEmpty()) break;
					if (val == -1) {
						int fKey = map.firstKey();
						if (map.get(fKey) == 1) map.remove(fKey);
						else map.put(fKey, map.get(fKey)-1);
					}
					else {
						int lKey = map.lastKey();
						if (map.get(lKey) == 1) map.remove(lKey);
						else map.put(lKey, map.get(lKey)-1);
					}
					break;
				}
			}
			if (map.isEmpty()) sb.append("EMPTY\n");
			else sb.append(map.lastKey() + " " + map.firstKey() + "\n");
		}
		System.out.print(sb.toString());
	}
}
