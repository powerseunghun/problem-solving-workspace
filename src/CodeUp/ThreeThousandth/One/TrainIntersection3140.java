package CodeUp.ThreeThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class TrainIntersection3140 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> st = new Stack<>();
		int N = Integer.parseInt(br.readLine()), target = 1, val = 0;
		StringTokenizer stk = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		while (stk.hasMoreTokens()) {
			val = Integer.parseInt(stk.nextToken());
			st.add(val);
			sb.append("S");
			
			while (!st.isEmpty() && st.peek() == target) {
				st.pop();
				sb.append("X");
				target++;
			}
		
			if (target > N) {
				System.out.println(sb);
				return;
			}
		}
		
		System.out.println("IMPOSSIBLE");
	}
}
