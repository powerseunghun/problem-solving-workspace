package Goorm.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumberExpression {
	static Set<String> check = new HashSet<>();
	static int expressCount = 0;
	static void search(int N, int sum, List<Integer> list) {
		if (sum >= N) {
			if (sum == N) {
				String str = "";
				Collections.sort(list);
				for (int i = 0; i < list.size(); i++) {
					str += list.get(i);
				}
				if (!check.contains(str)) {
					expressCount++;
					check.add(str);
				}
			}
			return;
		}
		
		for (int i = 1; i <= N; i++) {
			List<Integer> tList = new ArrayList<>();
			for (int j = 0; j < list.size(); j++) {
				tList.add(list.get(j));
			}
			tList.add(i);
			search(N, sum+i, tList);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<>();
		
		search(N, 0, list);
	}
}
