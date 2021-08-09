package Acmicpc.BruteForceAlgorithm.TenThousandth.Six.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class AddBracket16637 {
	static ArrayList<Integer> num = new ArrayList<>();
	static ArrayList<Character> op = new ArrayList<>();
	static int max = Integer.MIN_VALUE;
	static int calc(Character op, int val1, int val2) {
		switch (op) {
		case '+': return val1 + val2;
		case '-': return val1 - val2;
		case '*': return val1 * val2;
		}
		return 0;
	}
	static void dfs(int result, int idx) {
		if (idx >= op.size()) {
			max = Math.max(result, max);
			return;
		}
		
		int val = calc(op.get(idx), result, num.get(idx+1));
		dfs(val, idx+1);
		
		if (idx +1 < op.size()) {
			val = calc(op.get(idx+1), num.get(idx+1), num.get(idx+2));
			int calVal = calc(op.get(idx), result, val);
			dfs(calVal, idx+2);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*') {
				op.add(str.charAt(i));
			}
			else num.add(str.charAt(i) - '0');
		}
		dfs(num.get(0), 0);
		System.out.println(max);
	}
}
