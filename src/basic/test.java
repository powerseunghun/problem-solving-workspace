package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class test {
	static int[] nums = null;
	static int[] arr = null;
	static boolean[] check = null;
	static StringBuilder sb = new StringBuilder();
	static void dfs(int m, int d) {
		if (d >= m) {
			for (int i = 0; i < arr.length; i++) {
				sb.append(arr[i] + " ");
			}
			sb.append("\n");
			return;
		}
		
		for (int i = 0; i < nums.length; i++) {
			if (!check[i]) {
				check[i] = true;
				arr[d] = nums[i];
				dfs(m, d+1);
				check[i] = false;
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		arr = new int[M];
		nums = new int[N];
		check = new boolean[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(nums);
		dfs(M, 0);
		System.out.print(sb.toString());
	}
}
