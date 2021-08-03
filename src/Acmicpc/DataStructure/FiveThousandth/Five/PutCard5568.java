package Acmicpc.DataStructure.FiveThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PutCard5568 {
	static String[] choice = null;
	static String[] arr = null;
	static boolean[] check = null;
	static Set<String> set = new HashSet<>();
	static void dfs(int k, int d) {
		if (d >= k) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < choice.length; i++) {
				sb.append(choice[i]);
			}
			set.add(sb.toString());
			return;
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (!check[i]) {
				check[i] = true;
				choice[d] = arr[i];
				dfs(k, d+1);
				check[i] = false;
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int k = Integer.parseInt(br.readLine());
		arr = new String[n];
		check = new boolean[n];
		choice = new String[k];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = br.readLine();
		}
		dfs(k, 0);
		System.out.println(set.size());
	}
}
