package Acmicpc.As.B3.TenThousandth.Six.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class MissingRunners16546 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), val = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		Map<Integer, Integer> map = new HashMap<>();
		
		while (st.hasMoreTokens()) {
			val = Integer.parseInt(st.nextToken());
			map.put(val, map.getOrDefault(val, 1)+1);
		}
		
		for (int i = 1; i <= N; i++) {
			if (!map.containsKey(i)) {
				val = i;
				break;
			}
		}
		
		System.out.println(val);
		br.close();
	}
}
