package Acmicpc.As.B3.TwentyThousandth.Four.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class СРЕЩАНАПРИЯТЕЛИ24333 {
	static Map<Integer, Integer> map = new HashMap<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int l1 = Integer.parseInt(tmp.split(" ")[0]);
		int r1 = Integer.parseInt(tmp.split(" ")[1]);
		int l2 = Integer.parseInt(tmp.split(" ")[2]);
		int r2 = Integer.parseInt(tmp.split(" ")[3]);
		int k = Integer.parseInt(tmp.split(" ")[4]), cnt = 0;
		
		for (int i = l1; i <= r1; i++) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		for (int i = l2; i <= r2; i++) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		map.put(k, 0);
		
		for (int i = Math.min(l1, l2); i <= Math.max(r1, r2); i++) {
			cnt += (map.containsKey(i) && map.get(i) > 1) ? 1 : 0;
		}
		
		System.out.println(cnt);
		br.close();
	}
}
