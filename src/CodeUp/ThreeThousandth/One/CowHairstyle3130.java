package CodeUp.ThreeThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class CowHairstyle3130 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> st = new Stack<>();
		long cnt = 0;
		
		for (int i = 0, val = 0; i < n; i++) {
			val = Integer.parseInt(br.readLine());
			while (true) {
				if (st.isEmpty()) {
					st.add(val);
					break;
				}
				int top = st.peek();
				if (top > val) {
					cnt += st.size();
					st.add(val);
					break;
				}
				else st.pop();
			}
		}
		System.out.println(cnt);
	}
}
