package Acmicpc.DataStructure.TenThousandth.Seven.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class FindPassword17219 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, String> map = new HashMap<>();
		String tmp = br.readLine();
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		
		for (int i = 0; i < N; i++) {
			tmp = br.readLine();
			if (!map.containsKey(tmp.split(" ")[0])) {
				map.put(tmp.split(" ")[0], tmp.split(" ")[1]);
			}
		}
		
		for (int i = 0; i < M; i++) {
			sb.append(map.get(br.readLine()) + "\n");
		}
		System.out.print(sb.toString());
	}
}
