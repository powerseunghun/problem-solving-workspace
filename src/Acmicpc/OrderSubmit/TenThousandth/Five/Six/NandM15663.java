package Acmicpc.OrderSubmit.TenThousandth.Five.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class NandM15663 {
	static int[] arr = null;
	static boolean[] check = null;
	static int[] nums = null;
	static Set<String> set = new HashSet<>();
	static void func(int m, int d) {
		if (d >= m) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < arr.length; i++) {
				sb.append(arr[i] + " ");
			}
			if (!set.contains(sb.toString())) {
				System.out.println(sb.toString());
				set.add(sb.toString());
			}
			return;
		}
		
		for (int i = 0; i < nums.length; i++) {
			if (!check[i]) {
				check[i] = true;
				arr[d] = nums[i];
				func(m, d+1);
				check[i] = false;
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		nums = new int[N];
		check = new boolean[N];
		arr = new int[M];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(nums);
		
		func(M, 0);
		br.close();
	}
}
