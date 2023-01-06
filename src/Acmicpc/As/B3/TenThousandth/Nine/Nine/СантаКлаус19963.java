package Acmicpc.As.B3.TenThousandth.Nine.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class СантаКлаус19963 {
	static Map<Integer, Integer> map = new HashMap<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int m = Integer.parseInt(tmp.split(" ")[1]);
		int k = Integer.parseInt(tmp.split(" ")[2]);
		
		for (int i = 0; i < 2; i++) {
			tmp = br.readLine();
			for (int j = 0, v = 0; j < tmp.split(" ").length; j++) {
				v = Integer.parseInt(tmp.split(" ")[j]);
				map.put(v, map.getOrDefault(v, 0)+1);
			}
		}
		for (int i = 1; i <= n; i++) {
			sb.append(map.containsKey(i) ? "" : (i + " "));
		}
		
		System.out.println(n-m-k);
		System.out.println(sb.toString());
		br.close();
	}
}
