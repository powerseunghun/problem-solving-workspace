package Acmicpc.As.B3.TwentyThousandth.Nine.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class WhichTeamShouldReceiveTheSponsorSize29684 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		Map<Integer, Integer> map = new HashMap<>();
		int n = 0, v = 0;
		List<Integer> list = new ArrayList<>();
		
		while(true) {
			n = Integer.parseInt(br.readLine());
			if (n == 0) break;
			map.clear();
			list.clear();
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++) {
				v = Math.abs(Integer.parseInt(st.nextToken()) - 2023);
				map.put(v, i+1);
				list.add(v);
			}
			Collections.sort(list);
			sb.append(map.get(list.get(0))).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}