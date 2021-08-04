package Acmicpc.GreedyAlgorithm.TwoThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Stack;

public class MakeBigNumber2812 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> st = new Stack<>();
		StringBuilder sb = new StringBuilder();
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int K = Integer.parseInt(tmp.split(" ")[1]), count = 0;
		int[] arr = new int[N];
		tmp = br.readLine();
		for (int i = 0; i < tmp.length(); i++) {
			arr[i] = tmp.charAt(i) - '0';
		}
		
		st.push(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			while (!st.isEmpty() && st.peek() < arr[i] && count != K) {
				st.pop();
				count++;
			}
			st.add(arr[i]);
		}
		while (count != K) {
			st.pop();
			count++;
		}
		
		if (st.size() > N-K) {
			for (int i = 0; i < K; i++) {
				st.pop();
			}
			while (!st.isEmpty()) {
				sb.append(st.pop());
			}
			System.out.print(sb.reverse());
			return;
		}
		
		while(!st.isEmpty()) {
			sb.append(st.pop());
		}
		System.out.println(sb.reverse());
	}
}
