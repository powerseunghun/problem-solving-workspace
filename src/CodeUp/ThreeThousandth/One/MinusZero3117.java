package CodeUp.ThreeThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class MinusZero3117 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Stack<Integer> st = new Stack<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine()), sum = 0;
		for (int i = 0, val = 0; i < K; i++) {
			val = Integer.parseInt(br.readLine());
			if (val == 0 && !st.isEmpty()) {
				st.pop();
			}
			else st.push(val);
		}
		
		while (!st.isEmpty()) {
			sum += st.pop();
		}
		
		System.out.println(sum);
	}
}
