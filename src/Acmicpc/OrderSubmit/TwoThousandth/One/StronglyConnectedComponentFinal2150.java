package Acmicpc.OrderSubmit.TwoThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class StronglyConnectedComponentFinal2150 {
	static List<List<Integer>> arr = new ArrayList<>();
	static List<List<Integer>> rArr = new ArrayList<>();
	static List<List<Integer>> sccList = new ArrayList<>();
	static boolean[] check = null;
	static List<Integer> vList = new ArrayList<>();
	static Stack<Integer> st = new Stack<>();
	static void dfsArr(int V) {
		check[V] = true;
		for (int i = 0, t = 0; i < arr.get(V).size(); i++) {
			t = arr.get(V).get(i);
			if (!check[t]) dfsArr(t);
		}
		st.push(V);
	}
	static void dfsrArr(int V, int idx) {
		check[V] = true;
		if (sccList.size() == idx) {
			sccList.add(new ArrayList<>());
		}
		sccList.get(idx).add(V);
		for (int i = 0, t = 0; i < rArr.get(V).size(); i++) {
			t = rArr.get(V).get(i);
			if (!check[t]) dfsrArr(t, idx);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = br.readLine();
		
		int V = Integer.parseInt(tmp.split(" ")[0]);
		int E = Integer.parseInt(tmp.split(" ")[1]), idx = 0;
		check = new boolean[V+1];
		
		for (int i = 0; i <= V; i++) {
			arr.add(new ArrayList<>());
			rArr.add(new ArrayList<>());
//			sccList.add(new ArrayList<>());
		}
		
		for (int i = 0, A = 0, B = 0; i < E; i++) {
			tmp = br.readLine();
			A = Integer.parseInt(tmp.split(" ")[0]);
			B = Integer.parseInt(tmp.split(" ")[1]);
			arr.get(A).add(B);
			rArr.get(B).add(A);
		}
		
		for (int i = 1; i < arr.size(); i++) Collections.sort(arr.get(i));
		for (int i = 1; i <= V; i++) {
			if (check[i]) continue;
			dfsArr(i);
		}
		Arrays.fill(check, false);
		while (!st.isEmpty()) {
			V = st.pop();
			if (check[V]) continue;
			dfsrArr(V, idx++);
		}
		
		for (int i = 0; i < sccList.size(); i++) {
			Collections.sort(sccList.get(i));
		}
		Collections.sort(sccList, new Comparator<List<Integer>>() {
			@Override
			public int compare(List<Integer> o1, List<Integer> o2) {
				return o1.get(0) - o2.get(0);
			}
		});
		
		sb.append(idx + "\n");
		for (int i = 0; i < sccList.size(); i++) {
			List<Integer> tmpList = sccList.get(i);
			for (int el : tmpList) {
				sb.append(el + " ");
			}
			sb.append("-1\n");
		}
		System.out.print(sb.toString());
		br.close();
	}
}
