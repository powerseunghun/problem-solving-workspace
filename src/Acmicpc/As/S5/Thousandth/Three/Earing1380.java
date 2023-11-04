package Acmicpc.As.S5.Thousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Earing1380 {
	static Map<Integer, String> map = new HashMap<>();
	static Map<Integer, Integer> nMap = new HashMap<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = 0;
		
		for (int a = 1;; a++) {
			n = Integer.parseInt(br.readLine());
			if (n == 0) break;
			map.clear();
			nMap.clear();
			
			for (int i = 1; i <= n; i++) {
				map.put(i, br.readLine());
			}
			
			for (int i = 0, t = 0; i < 2*n-1; i++) {
				t = Integer.parseInt(br.readLine().split(" ")[0]);
				if (nMap.containsKey(t)) {
					nMap.remove(t);
				}
				else nMap.put(t, 0);
			}
			sb.append(a + " ");
			sb.append(map.get(new ArrayList<>(nMap.keySet()).get(0))).append("\n");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
