package CodeUp.ThreeThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class MemoryTest3020 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Integer> map = new HashMap<>();
		int N = Integer.parseInt(br.readLine());
		String tmp = null;
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < N; i++) {
			tmp = st.nextToken();
			if (!map.containsKey(tmp)) {
				map.put(tmp, i+1);
			}
		}
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < M; i++) {
			tmp = st.nextToken();
			if (map.containsKey(tmp)) {
				sb.append(map.get(tmp) + " ");
			}
			else sb.append("-1 ");
		}
		System.out.println(sb);
	}
}
