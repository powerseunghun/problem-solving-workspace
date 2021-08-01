package Acmicpc.DataStructure.TwoThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class MemorizationKing2776 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = null;
		Map<Integer, Integer> map = new HashMap<>();
		int T = Integer.parseInt(br.readLine()), N = 0, M = 0, val = 0;
		
		for (int i = 0; i < T; i++) {
			map.clear();
			sb = new StringBuilder();
			N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				val = Integer.parseInt(st.nextToken());
				if (!map.containsKey(val)) {
					map.put(val, 1);
				}
			}
			M = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			
			while (st.hasMoreTokens()) {
				val = Integer.parseInt(st.nextToken());
				if (!map.containsKey(val)) sb.append("0\n");
				else sb.append("1\n");
			}
			System.out.print(sb.toString());
		}
	}
}
