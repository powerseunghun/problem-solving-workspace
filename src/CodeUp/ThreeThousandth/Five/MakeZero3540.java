package CodeUp.ThreeThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakeZero3540 {
	static char[] arr = null;
	static void bt(int N, int depth, char[] ops, int[] nums) {
		if (N == depth) {
			StringBuilder sb = new StringBuilder();
			int res = nums[0];
			sb.append(nums[0]);
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			for (int i = 0; i < arr.length; i++) {
				sb.append(arr[i]);
				sb.append(nums[i+1]);
				switch(arr[i]) {
				case ' ':
					res = Integer.parseInt((res + "") + (nums[i+1] + ""));
					break;
				case '+':
					res += nums[i+1];
					break;
				case '-':
					res -= nums[i+1];
					break;
				}
			}
			return;
		}
		
		for (int i = 0; i < arr.length; i++) {
			arr[depth] = ops[i % ops.length];
			bt(N, depth+1, ops, nums);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		arr = new char[N-1];
		int[] nums = new int[N];
		for (int i = 0; i < N; i++) {
			nums[i] = i+1;
		}
		char[] ops = { '-', '+', '+' };
		
		bt(N-1, 0, ops, nums);
	}
}
