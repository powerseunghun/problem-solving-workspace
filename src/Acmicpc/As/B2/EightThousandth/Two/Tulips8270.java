package Acmicpc.As.B2.EightThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Tulips8270 {
	static final int base = 15000;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer, Integer> map = new HashMap<>();
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int v = 0;
		
		while (st.hasMoreTokens()) {
			v = Integer.parseInt(st.nextToken());
			map.put(v, map.getOrDefault(v, 0)+1);
		}
		
		System.out.println(base - map.keySet().size());
		br.close();
	} 
}
