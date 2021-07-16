package Acmicpc.Step18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class GetNGE17298 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stk = new Stack<>();
		int[] arr = new int[N], nge = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = N-1; i >= 0; i--) {
			while (!stk.isEmpty() && stk.peek() <= arr[i]) {
				stk.pop();
			}
			nge[i] = stk.isEmpty() ? -1 : stk.peek();
			stk.push(arr[i]);
		}
		
		for (int i = 0; i < nge.length; i++) {
			sb.append(nge[i] + " ");
		}
		
		System.out.println(sb.toString());
	}
}
