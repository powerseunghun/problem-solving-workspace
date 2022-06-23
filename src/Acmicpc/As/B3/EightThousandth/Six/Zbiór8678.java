package Acmicpc.As.B3.EightThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Zbiór8678 {
	static Map<Integer, Integer> map = new HashMap<>();
	static boolean check(int a, int b) {
		map.clear();
		for (int i = 1; i <= Math.sqrt(b); i++) {
			if (b%i == 0) {
				if (i*i == b) map.put(b, 1);
				else {
					map.put(i, 1);
					map.put(b/i, 1);
				}
			}
		}
		for (int i = 1; i <= Math.sqrt(a); i++) {
			if (a%i == 0) {
				if (i*i == a) {
					if (!map.containsKey(i)) return false;
				}
				else {
					if (!map.containsKey(i) || !map.containsKey(a/i)) return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int z = Integer.parseInt(br.readLine()), a = 0, b = 0;
		String tmp = null;
		
		while (z-- > 0) {
			tmp = br.readLine();
			a = Integer.parseInt(tmp.split(" ")[0]);
			b = Integer.parseInt(tmp.split(" ")[1]);
			
			sb.append(check(a,b) ? "TAK\n" : "NIE\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
