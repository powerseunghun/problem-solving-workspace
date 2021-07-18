package Acmicpc.Step21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CutTree2805 {
	static int[] tree = null;
	static boolean check(int cut, int M) {
		long cnt = 0;
		for (int i = 0; i < tree.length; i++) {
			cnt += (tree[i] - cut < 0 ? 0 : tree[i]-cut);
		}
		if (cnt >= M) return true;
		else return false;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		int left = 1, right = 0, cut = 0, setHeight = 0;
		tree = new int[N];
		
		for (int i = 0; i < tree.length; i++) {
			tree[i] = Integer.parseInt(st.nextToken());
			right = Math.max(tree[i], right);
		}
		
		while (left <= right) {
			cut = (left + right)/2;
			if (check(cut, M)) {
				if (cut > setHeight) {
					setHeight = cut;
				}
				left = cut+1;
			}
			else right = cut-1;
		}
		System.out.println(setHeight);
	}
}
