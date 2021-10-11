package LettCode.Hundred.Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class P22GenerateParentheses {
	static char[] arr = null;
	static List<String> list = new ArrayList<>();
	static boolean check() {
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '(') st.push(arr[i]);
			else {
				if (st.isEmpty()) return false;
				else {
					char val = st.pop();
					if (val != '(') return false;
				}
			}
		}
		if (!st.isEmpty()) return false;
		return true;
	}
	static void dfs(int n, int d) {
		if (d >= n) {
			String str = "";
			if (check()) {
				for (int i = 0; i < arr.length; i++) {
					str += arr[i];
				}
				list.add(str);
			}
			return;
		}
		for (int i = 0; i < 2; i++) {
			arr[d] = i % 2 == 0 ? '(' : ')';
			dfs(n, d+1);
		}
	}
	public static void main(String[] args) {
		int n = 8;
		arr = new char[n*2];
		dfs(n*2, 0);
		System.out.println(list.size());
	}
}
