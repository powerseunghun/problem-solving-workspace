package Acmicpc.BruteForceAlgorithm.Thousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Teaching1062 {
	static boolean[] check = new boolean[26];
	static String[] strs = null;
	static int max = Integer.MIN_VALUE;
	static char[] words = null;
	static void checkInit() {
//		String str = "antatica";
//		for (int i = 0; i < str.length(); i++) {
//			check[str.charAt(i)-97] = true;
//		}
		check['a'-97] = true;
		check['n'-97] = true;
		check['t'-97] = true;
		check['i'-97] = true;
		check['c'-97] = true;
	}
	static void dfs(int n, int d, int sidx) {
		if (d >= n) {
			int count = 0;
			boolean flag = true;
			for (int i = 0; i < strs.length; i++) {
				flag = true;
				for (int j = 0; j < strs[i].length(); j++) {
					if (!check[strs[i].charAt(j)-97]) {
						flag = false;
						break;
					}
				}
				if (flag) count++;
			}
			max = Math.max(max, count);
//			for (int i = 0; i < words.length; i++) {
//				System.out.print(words[i] + " ");
//			}
//			System.out.println();
			return;
		}
		
		for (int i = sidx; i < 26; i++) {
			if (!check[i]) {
				check[i] = true;
				dfs(n, d+1, i+1);
				check[i] = false;
			}
		}
//		for (char i = sidx; i <= 'z'; i++) {
//			if (!check[i-97]) {
//				words[d] = i;
//				check[i-97] = true;
//				dfs(n, d+1, i);
//				check[i-97] = false;
//			}
//		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int K = Integer.parseInt(tmp.split(" ")[1]);
		strs = new String[N];
		
		checkInit();
		for (int i = 0; i <strs.length; i++) {
			strs[i] = br.readLine().replace("anta", "").replace("tica", "");
		}
		
		if (K < 5) {
			System.out.println("0");
			return;
		}
		else if (K == 26) {
			System.out.println(N);
			return;
		}
		else {
			words = new char[K-5];
			dfs(K-5, 0, 0);
			System.out.println(max);
		}
	}
}
