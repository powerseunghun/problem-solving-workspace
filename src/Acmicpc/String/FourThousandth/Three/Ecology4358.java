package Acmicpc.String.FourThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Ecology4358 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Integer> map = new HashMap<>();
		String tmp = br.readLine();
		StringBuilder sb = new StringBuilder();
		double area = 1, p = 0;
		
		while (true) {
			if (!map.containsKey(tmp)) map.put(tmp, 1);
			else map.put(tmp, map.get(tmp)+1);
			area++;
			
			tmp = br.readLine();
			if (tmp == null || tmp.length() == 0) break;
		}
		Object[] keySet = map.keySet().toArray();
		Arrays.sort(keySet);
		
		for (int i = 0, count = 0; i < keySet.length; i++) {
			count = map.get(keySet[i].toString());
			p = (count / area) * 100;
			sb.append(keySet[i].toString() + " " + String.format("%.4f", p) + "\n");
		}
		System.out.print(sb.toString());
	}
}
