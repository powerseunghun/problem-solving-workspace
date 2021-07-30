package Acmicpc.GraphTheory.TenThousandth.One.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class FindTreeParents11725 {
	static boolean[] check = null;
	static int[] pn = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int N = Integer.parseInt(br.readLine()), a = 0, b = 0;
		check = new boolean[N+1];
		pn = new int[N+1];
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i <= N; i++) {
			list.add(new ArrayList<>());
		}
		for (int i = 0; i < N-1; i++) {
			tmp = br.readLine();
			a = Integer.parseInt(tmp.split(" ")[0]);
			b = Integer.parseInt(tmp.split(" ")[1]);
			list.get(a).add(b);
			list.get(b).add(a);
		}
		
		q.add(1);
		check[1] = true;
		
		for (int i = 0; i < list.get(1).size(); i++) {
			q.add(list.get(1).get(i));
		}
		
		while (!q.isEmpty()) {
			int t = q.poll();
			check[t] = true;
			
			for (int i = 0; i < list.get(t).size(); i++) {
				if (!check[list.get(t).get(i)]) {
					pn[list.get(t).get(i)] = t;
					check[list.get(t).get(i)] = true;
					q.add(list.get(t).get(i));
				}
			}
		}
		
		for (int i = 2; i < pn.length; i++) {
			System.out.println(pn[i]);
		}
	}
}
