package Goorm.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlphabetTreeToy {
	static int minValue = Integer.MAX_VALUE;
	static int maxValue = Integer.MIN_VALUE;
	static List<List<Character>> list = new ArrayList<>();
	static Map<Character, Integer> map = new HashMap<>();
	static void mapInit() {
		int weight = 1;
		for (char c = 'A'; c <= 'Z'; c++) {
			map.put(c, weight++);
		}
	}
	static void listInit(int N) {
		for (int i = 0; i < N; i++) {
			list.add(new ArrayList<>());
		}
	}
	static void dfs(int n, int d, int idx, String str) {
		if (d >= n) {
			int sum = 0;
			for (int i = 0; i < str.length(); i++) {
				sum += map.get(str.charAt(i));
			}
			minValue = Math.min(sum, minValue);
			maxValue = Math.max(sum, maxValue);
			return;
		}
		
		int firstIdx = idx*2, secondIdx = firstIdx+1;
		List<Character> tmp = list.get(d);
		dfs(n, d+1, firstIdx, str+tmp.get(firstIdx));
		dfs(n, d+1, secondIdx, str+tmp.get(secondIdx));
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String tmp = null;
		listInit(N);
		mapInit();
		
		for (int i = 0; i < N; i++) {
			tmp = br.readLine();
			for (int j = 0; j < tmp.length(); j++) {
				list.get(i).add(tmp.charAt(j));
			}
		}
		
		dfs(N, 1, 0, list.get(0).get(0)+"");
		System.out.println(minValue);
		System.out.println(maxValue);
	}
}
