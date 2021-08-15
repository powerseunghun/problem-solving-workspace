package Acmicpc.Sorting.TenThousandth.One.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class YangjojangOfTheYear11557 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		String school = null;
		int T = Integer.parseInt(br.readLine()), max = 0, N = 0;
		Map<Integer, String> map = new HashMap<>(); 
		
		for (int i = 0; i < T; i++) {
			map.clear();
			max = Integer.MIN_VALUE;
			N = Integer.parseInt(br.readLine());
			for (int j = 0, val = 0; j < N; j++) {
				st = new StringTokenizer(br.readLine());
				school = st.nextToken();
				val = Integer.parseInt(st.nextToken());
				if (!map.containsKey(val)) map.put(val, school);
				max = Math.max(val, max);
			}
			sb.append(map.get(max)+"\n");
		}
		System.out.print(sb.toString());
	}
}
