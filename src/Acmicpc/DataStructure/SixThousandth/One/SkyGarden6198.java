package Acmicpc.DataStructure.SixThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class SkyGarden6198 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> st = new Stack<>();
		int n = Integer.parseInt(br.readLine());
		long sum = 0;
		
		for (int i = 0, height = 0; i < n; i++) {
			height = Integer.parseInt(br.readLine());
			while (!st.isEmpty() && st.peek() <= height) {
				st.pop();
			}
			sum += st.size();
			st.push(height);
		}
		System.out.println(sum);
	}
}
