package SWExpertAcademy.D3.TwoThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class StringUnion2948 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		String tmp = null;
		Map<String, Integer> map = new HashMap<>();
		int T = Integer.parseInt(br.readLine()), N = 0, M = 0, cnt = 0;
		
		for (int i = 1; i <= T; i++) {
			map.clear();
			cnt = 0;
			br.readLine();
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				tmp = st.nextToken();
				if (!map.containsKey(tmp)) map.put(tmp, 1);
			}
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				if (map.containsKey(st.nextToken())) cnt++;
			}
			sb.append("#" + i + " " + cnt + "\n");
		}
		System.out.print(sb.toString());
	}
}
