package Acmicpc.As.B3.SevenThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pasislėpęromėniškiskaičiai7218 {
	static String[] strs = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII"};
	static Map<String, Integer> map = new HashMap<>();
	static void mapInit() {
		for (int i = 1; i <= strs.length; i++) {
			map.put(strs[i-1], i);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		List<Integer> list = new ArrayList<>();
		br.readLine();
		String str = br.readLine();
		mapInit();
		
		for (String key : map.keySet()) {
			if (str.contains(key)) {
				list.add(map.get(key));
			}
		}
		Collections.sort(list);
		for (Integer n : list) {
			sb.append(n + " ");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
