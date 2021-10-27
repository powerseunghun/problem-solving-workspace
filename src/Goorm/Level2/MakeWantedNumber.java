package Goorm.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class MakeWantedNumber {
	static int[] arr = new int[3];
	static List<Integer> nums = new ArrayList<>();
	static Set<String> set = new HashSet<>();
	static Queue<int[]> q = new LinkedList<>();
	static void dfs(int n, int d, int idx, int wantedNumber) {
		if (d >= n) {
			int sum = 0;
			String str = "";
			int[] qArr = new int[3];
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i];
				str += (arr[i]+"");
				qArr[i] = arr[i];
			}
			if (!set.contains(str) && sum == wantedNumber) {
				set.add(str);
				q.add(qArr);
			}
			return;
		}
		
		for (int i = idx; i < nums.size(); i++) {
			arr[d] = nums.get(i);
			dfs(n, d+1, i+1, wantedNumber);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int wantedNumber = Integer.parseInt(br.readLine());
		
		while (st.hasMoreTokens()) {
			nums.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(nums);
		
		dfs(3, 0, 0, wantedNumber);
		
		if (q.isEmpty()) {
			System.out.println("NO");
			return;
		}
		
		while (!q.isEmpty()) {
			int[] printArr = q.poll();
			for (int i = 0; i < printArr.length; i++) {
				sb.append(printArr[i]);
				if (i == printArr.length-1) sb.append("\n");
				else sb.append(" ");
			}
		}
		
		System.out.println(sb.toString());
	}
}
