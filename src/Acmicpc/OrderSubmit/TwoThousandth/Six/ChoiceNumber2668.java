package Acmicpc.OrderSubmit.TwoThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChoiceNumber2668 {
	static int[] arr = null;
	static boolean[] check = null;
	static List<Integer> list = new ArrayList<>();
	static void dfs(int i, int j) {
		if (arr[i] == j) list.add(j);
		if (!check[arr[i]]) {
			check[arr[i]] = true;
			dfs(arr[i], j);
			check[arr[i]] = false;
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		arr = new int[N+1];
		check = new boolean[N+1];
		
		for (int i = 1; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for (int i = 1; i <= N; i++) {
			check[i] = true;
			dfs(i, i);
			check[i] = false;
		}
		Collections.sort(list);
		System.out.println(list.size());
		for (int el : list) {
			System.out.println(el);
		}
		br.close();
	}
}
