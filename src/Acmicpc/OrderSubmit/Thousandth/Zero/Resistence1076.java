package Acmicpc.OrderSubmit.Thousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Resistence1076 {
	static Map<String, Long> valueMap = new HashMap<>();
	static Map<String, Long> multipleMap = new HashMap<>();
	static void mapinit() {
		String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
		long base = 1;
		for (int i = 0; i < color.length; i++) {
			valueMap.put(color[i], (long)i);
			multipleMap.put(color[i], base);
			base *= 10;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String color = null;
		StringBuilder sb = new StringBuilder();
		long ans = 0;
		
		mapinit();
		for (int i = 0; i < 3; i++) {
			color = br.readLine();
			if (i < 2) {
				sb.append(valueMap.get(color));
				continue;
			}
			ans = Long.parseLong(sb.toString()) * multipleMap.get(color);
		}
		System.out.println(ans);
		br.close();
	}
}
