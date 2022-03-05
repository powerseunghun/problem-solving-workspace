package Acmicpc.OrderSubmit.TwoThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class StronglyConnectedComponentMemOut2150 {
	static int[][] arr = null;
	static int[][] rArr = null;
	static List<List<Integer>> sccList = null;
	static boolean[] check = null;
	static Map<Integer, List<Integer>> map = new HashMap<>();
	static List<Integer> vList = new ArrayList<>();
	static Stack<Integer> st = new Stack<>();
	static void dfsArr(int V) {
		check[V] = true;
		for (int i = 1; i < arr[V].length; i++) {
			if (arr[V][i] > 0 && !check[i]) {
				dfsArr(i);
			}
		}
		st.push(V);
	}
	static void dfsrArr(int V, int idx) {
		check[V] = true;
		sccList.get(idx).add(V);
		for (int i = 1; i < rArr[V].length; i++) {
			if (rArr[V][i] > 0 && !check[i]) {
				dfsrArr(i, idx);
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = br.readLine();
		
		int V = Integer.parseInt(tmp.split(" ")[0]);
		int E = Integer.parseInt(tmp.split(" ")[1]), idx = 1;
		arr = new int[V+1][V+1];
		rArr = new int[V+1][V+1];
		check = new boolean[V+1];
		sccList = new ArrayList<>();
		
		for (int i = 1; i <= V; i++) {
			sccList.add(new ArrayList<>());
		}
		
		for (int i = 0, A = 0, B = 0; i < E; i++) {
			tmp = br.readLine();
			A = Integer.parseInt(tmp.split(" ")[0]);
			B = Integer.parseInt(tmp.split(" ")[1]);
			arr[A][B] = 1;
			rArr[B][A] = 1;
		}
		
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
//		for (int i = 1; i < idx; i++) {
//			List<Integer> list = sccList.get(i);
//			Collections.sort(list);
//			for (int j = 0; j < list.size(); j++) {
//				System.out.print(list.get(j) + " ");
//			}
//			System.out.println();
//		}
		
		for (int i = 1; i < idx; i++) {
			Collections.sort(sccList.get(i));
		}
		
		for (int i = 1; i < idx; i++) {
			List<Integer> list = sccList.get(i);
			List<Integer> tmpList = null;
			
			for (int j = 0; j < list.size(); j++) {
				if (j == 0) {
					tmpList = new ArrayList<>();
					tmpList.add(list.get(j));
					vList.add(list.get(j));
					map.put(list.get(j), tmpList);
				}
				else {
					tmpList = map.get(list.get(0));
					tmpList.add(list.get(j));
					map.put(list.get(0), tmpList);
				}
			}
		}
		Collections.sort(vList);
		sb.append((idx-1) + "\n");
		for (int el : vList) {
			List<Integer> tmpList = map.get(el);
			for (int v : tmpList) {
				sb.append(v + " ");
			}
			sb.append("-1\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
