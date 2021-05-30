package CodeUp.ThreeThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class STLStack3102 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> st = new Stack<>();
		
		String str = null;
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			str = br.readLine();
			if (str.contains("push")) {
				str = str.replaceAll("[a-z]|_| |\\(|\\)", "");
				st.push(Integer.parseInt(str));
			}
			else if (str.contains("top")) {
				if (st.isEmpty()) {
					System.out.println("-1");
				}
				else System.out.println(st.get(st.size()-1));
			}
			else if (str.contains("pop")) {
				if (!st.isEmpty()) st.pop();
			}
			else if (str.contains("size")) {
				System.out.println(st.size());
			}
			else if (str.contains("empty")) {
				if (st.isEmpty()) {
					System.out.println("true");
				}
				else System.out.println("false");
			}
		}
		
	}
}
