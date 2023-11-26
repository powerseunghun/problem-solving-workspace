package Acmicpc.As.S5.TenThousandth.One.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Election11637 {
	static Map<Integer, Integer> map = new HashMap<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0, max = 0, maxCnt = 0, sum = 0, u = 0;
		
		while(T-- > 0) {
			N = Integer.parseInt(br.readLine());
			
			map.clear();
			max = Integer.MIN_VALUE;
			maxCnt = 0;
			sum = 0;
			for (int i = 1, v = 0; i <= N; i++) {
				v = Integer.parseInt(br.readLine());
				sum += v;
				max = Math.max(max, v);
				map.put(i, v);
			}
			
			for (Integer k : map.keySet()) {
				if (map.get(k) == max) {
					maxCnt++;
					u = k;
				}
			}
			
			if (maxCnt > 1) {
				sb.append("no winner");
			}
			else {
				sb.append(max > sum/2 ? "majority " : "minority ");
				sb.append("winner ").append(u);
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
