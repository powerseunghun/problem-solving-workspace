package Acmicpc.DataStructure.TenThousandth.Seven.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class NGF17299 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N+1];
		int[] count = new int[1000001];
		int[] ans = new int[N+1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		Stack<Integer> stk = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0, val = 0; i < N; i++) {
			val = Integer.parseInt(st.nextToken());
			arr[i+1] = val;
			count[val]++;
		}
		
		for (int i = arr.length-1; i >= 1; i--) {
			if (stk.isEmpty()) {
				stk.push(arr[i]);
				ans[i] = -1;
			}
			else if (count[stk.peek()] > count[arr[i]]) {
				ans[i] = stk.peek();
				stk.push(arr[i]);
			}
			else {
				while (!stk.isEmpty() && count[arr[i]] >= count[stk.peek()]) {
					stk.pop();
				}
				if (stk.isEmpty()) {
					ans[i] = -1;
					stk.push(arr[i]);
				}
				else {
					ans[i] = stk.peek();
					stk.push(arr[i]);
				}
			}
		}
		for (int i = 1; i < arr.length; i++) {
			sb.append(ans[i] + " ");
		}
		System.out.println(sb.toString());
	}
}
