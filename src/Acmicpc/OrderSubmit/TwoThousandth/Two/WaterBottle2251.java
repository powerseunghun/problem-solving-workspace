package Acmicpc.OrderSubmit.TwoThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class WaterBottle2251 {
	// 0, 1, 2
	static int A = 0, B = 0, C = 0;
	static int[] nums = new int[3];
	static boolean[][] check = new boolean[201][201];
	static Set<Integer> set = new TreeSet<>();
	static void dfs(int A, int B, int C) {
		if (check[A][B]) return;
		
		if (A == 0) set.add(C);
		check[A][B] = true;
		 
		// 01, 10, 20, 21, 02, 12  
		if (A+B > nums[1]) {
			dfs((A+B)-nums[1], nums[1], C);
		}
		else dfs(0, A+B, C);
		
		if (A+B > nums[0]) {
			dfs(nums[0], A+B-nums[0], C);
		}
		else dfs(A+B, 0, C);
		
		if (A+C > nums[0]) {
			dfs(nums[0], B, A+C-nums[0]);
		}
		else dfs(A+C, B, 0);
		
		if (B+C > nums[1]) {
			dfs(A, nums[1], B+C-nums[1]);
		}
		else dfs(A, B+C, 0);
		
		dfs(A, 0, B+C);
		dfs(0, B, A+C);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = br.readLine();
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(tmp.split(" ")[i]);
		}
		
		dfs(0, 0, nums[2]);
		Iterator<Integer> iter = set.iterator();
		
		while (iter.hasNext()) {
			sb.append(iter.next() + " ");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
