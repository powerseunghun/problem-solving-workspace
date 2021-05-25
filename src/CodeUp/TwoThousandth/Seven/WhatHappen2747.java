package CodeUp.TwoThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WhatHappen2747 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<String> list = new ArrayList<>();
		Map<String, Character> check = new HashMap<>();
		Map<String, Integer> map = new HashMap<>();
		String tmp = null;
		
		for (int i = 0; i < n; i++) {
			tmp = br.readLine();
			list.add(tmp);
			if (map.containsKey(tmp)) {
				map.put(tmp, map.get(tmp)+1);
			}
			else map.put(tmp, 1);
		}
		
		for (int i = 0, idx = 1; i < list.size(); i++) {
			if (!check.containsKey(list.get(i))) {
				check.put(list.get(i), 'y');
				System.out.println((idx++) + " " +list.get(i) + " : " + map.get(list.get(i)));
			}
		}
		
		
	}
}
