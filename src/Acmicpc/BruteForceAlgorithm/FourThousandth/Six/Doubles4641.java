package Acmicpc.BruteForceAlgorithm.FourThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Doubles4641 {
	static int[] arr = new int[2];
	static ArrayList<Integer> list = new ArrayList<>();
	static int count = 0;
	static void dfs(int n, int d, int idx) {
		if (d >= n) {
			int max = Math.max(arr[0], arr[1]);
			int min = Math.min(arr[0], arr[1]);
			if (min * 2 == max) count++;
			return;
		}
		
		for (int i = idx; i < list.size(); i++) {
			arr[d] = list.get(i);
			dfs(n, d+1, i+1);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		int val = 0;
		String tmp = null;
		while (true) {
			count = 0;
			tmp = br.readLine();
			if (tmp.equals("-1")) break;
			
			st = new StringTokenizer(tmp);
			list.clear();
			while (st.hasMoreTokens()) {
				val = Integer.parseInt(st.nextToken());
				if (val == 0) break;
				list.add(val);
			}
			
			dfs(2, 0, 0);
			sb.append(count + "\n");
		}
		System.out.print(sb.toString());
	}
}
