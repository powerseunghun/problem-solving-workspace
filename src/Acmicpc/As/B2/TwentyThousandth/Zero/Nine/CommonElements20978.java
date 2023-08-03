package Acmicpc.As.B2.TwentyThousandth.Zero.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class CommonElements20978 {
	static final int step = 2;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Set<Integer> set = new HashSet<>();
		List<Integer> list = new ArrayList<>();
		StringTokenizer st = null;
		String kStr = null;
		br.readLine();
		
		for (int i = 0, v = 0; i < step; i++) {
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				v = Integer.parseInt(st.nextToken());
				if (i == 0) {
					set.add(v);
				}
				else {
					if (set.contains(v) && !list.contains(v)) {
						list.add(v);
					}
				}
			}
		}
		Collections.sort(list);
		
		
		for (Integer kInt : list) {
			sb.append(kInt).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
