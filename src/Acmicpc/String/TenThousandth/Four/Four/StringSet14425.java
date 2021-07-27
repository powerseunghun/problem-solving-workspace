package Acmicpc.String.TenThousandth.Four.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class StringSet14425 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		Map<String, Integer> map = new HashMap<>();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]), count = 0;
		
		for (int i = 0; i < N; i++) {
			tmp = br.readLine();
			map.put(tmp, 1);
		}
		
		for (int i = 0; i < M; i++) {
			tmp = br.readLine();
			if (map.containsKey(tmp)) count++;
		}
		
		System.out.println(count);
	}
}
