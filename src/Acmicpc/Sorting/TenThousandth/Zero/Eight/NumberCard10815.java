package Acmicpc.Sorting.TenThousandth.Zero.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class NumberCard10815 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Map<Integer, Integer> map = new HashMap<>();
		int N = Integer.parseInt(br.readLine()), M = 0, val = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
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
			if (map.containsKey(val)) sb.append("1 ");
			else sb.append("0 ");
		}
		
		System.out.println(sb.toString());
	}
}
