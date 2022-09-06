package Acmicpc.As.B3.TenThousandth.Seven.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class VendingMachine17284 {
	static Map<Integer, Integer> map = new HashMap<>();
	static void mapInit() {
		map.put(1, 500);
		map.put(2, 800);
		map.put(3, 1000);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = 5000, val = 0;
		mapInit();
		
		while (st.hasMoreTokens()) {
			val = Integer.parseInt(st.nextToken());
			m -= map.get(val);
		}
		
		System.out.println(m);
		br.close();
	}
}
