package Acmicpc.GraphTheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PoketMonMasterLeeDaSom1620 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringBuilder sb = new StringBuilder();
		Map<String, Integer> map1 = new HashMap<>();
		Map<String, String> map2 = new HashMap<>();
		
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int K = Integer.parseInt(tmp.split(" ")[1]);
		for (int i = 1; i <= N; i++) {
			tmp = br.readLine();
			map1.put(tmp, i);
			map2.put(i+"", tmp);
		}
		
		for (int i = 0; i < K; i++) {
			tmp = br.readLine();
			if (map1.containsKey(tmp)) {
				sb.append(map1.get(tmp)+"\n");
			}
			else if (map2.containsKey(tmp)) {
				sb.append(map2.get(tmp)+"\n");
			}
		}
		System.out.print(sb.toString());
	}
}
