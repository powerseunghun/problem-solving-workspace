package CodeUp.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class ChemicalWeight2013 {
	static Map<String, Double> map = new HashMap<>();
	static void init() {
		map.put("H", 1.0); map.put("He", 4.0); map.put("B", 10.8); map.put("C", 12.0);
		map.put("N", 14.0); map.put("O", 16.0); map.put("F", 19.0); map.put("Ne", 20.2);
		map.put("Na", 23.0); map.put("P", 31.0); map.put("S", 32.0); map.put("Cl", 35.5);
		map.put("K", 39.1);
	}
	static double get(String str) {
		String c = "";
		String weight = "";
		if (map.containsKey(str)) {
			return map.get(str);
		}
		else {
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
					weight += str.charAt(i);
				}
				else {
					c += str.charAt(i);
				}
			}
			return map.get(c) * Integer.parseInt(weight);
 		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine() + "!";
		String v = "";
		double sum = 0;
		init();
		
		for (int i = 0; i < tmp.length(); i++) {
			if ((tmp.charAt(i) >= 'A' && tmp.charAt(i) <= 'Z' && i > 0) || (tmp.charAt(i) == '!')) {
				sum += get(v);
				v = "";
			}
			v += tmp.charAt(i);
		}
		if (sum - (int)sum == 0) {
			System.out.printf("%.0f", sum);
		} 
		else System.out.printf("%.1f", sum);
	}
}
