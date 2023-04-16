package Acmicpc.As.B2.FiveThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class FakeTickets5778 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int N = 0, M = 0, v = 0, res = 0;
		Map<Integer, Integer> map = new HashMap<>();
		String str = null;
		
		while(true) {
			str = br.readLine();
			N = Integer.parseInt(str.split(" ")[0]);
			M = Integer.parseInt(str.split(" ")[1]);
			if (N == 0 && M == 0) break;
			res = 0;
			st = new StringTokenizer(br.readLine());
			map.clear();
			
			while (st.hasMoreTokens()) {
				v = Integer.parseInt(st.nextToken());
				map.put(v, map.getOrDefault(v, 0)+1);
				if (map.get(v) == 2) res++;
			}
			
			sb.append(res).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
