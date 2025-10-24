package Acmicpc.As.B3.ThirtyThousandth.Four.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class CDOTPathfinder34426 {
	static Map<Double, Integer> map = new HashMap<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0;
		double a = 0, b = 0, min = 0;
		StringTokenizer st = null;
		
		while(T-- > 0) {
			map.clear();
			min = Double.MAX_VALUE;
			N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				a = Double.parseDouble(st.nextToken());
				b = Double.parseDouble(st.nextToken());
				map.put(b/a, i+1);
				min = Math.min(b/a, min);
			}
			sb.append(map.get(min)).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
