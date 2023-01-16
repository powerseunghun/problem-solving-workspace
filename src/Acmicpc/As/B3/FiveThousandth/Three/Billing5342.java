package Acmicpc.As.B3.FiveThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Billing5342 {
	static Map<String, Double> map = new HashMap<>();
	static void mapInit() {
		String[] strs = {"Paper", "Printer", "Planners", "Binders", "Calendar", "Notebooks", "Ink"};
		double[] costs = {57.99, 120.5, 31.25, 22.5, 10.95, 11.2, 66.95};
		for (int i = 0; i < strs.length; i++) {
			if (!map.containsKey(strs[i])) map.put(strs[i], costs[i]);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		double res = 0;
		
		mapInit();
		while (!(str = br.readLine()).equals("EOI")) {
			res += map.containsKey(str) ? map.get(str) : 0;
		}
		
		System.out.println(String.format("$%.2f\n", res));
		br.close();
	}
}
