package Acmicpc.As.B3.TwentyThousandth.Nine.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Фигурки29029 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Character, Integer> map = new HashMap<>();
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int res = Integer.MIN_VALUE;
		
		for (int i = 0; i < str.length(); i++) {
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
		}
		
		for (Character key : map.keySet()) {
			res = Math.max(map.get(key), res);
		}
		
		System.out.println(N-res);
		br.close();
	}
}
