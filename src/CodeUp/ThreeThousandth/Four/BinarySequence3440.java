package CodeUp.ThreeThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinarySequence3440 {
	static int[] arr = null;
	static StringBuilder sb = new StringBuilder();
	static void bt(int n, int depth, int k) {
		if (depth == n) {
			int count = 0;
			for (int i = 0; i < n; i++) {
				if (arr[i] == 1) {
					count++;
				}
			}
			if (count == k) {
				for (int i = 0; i < arr.length; i++) {
					sb.append(arr[i]);
				}
				sb.append(" ");
			}
			return;
		}
		arr[depth] = 0;
		bt(n, depth+1, k);
		arr[depth] = 1;
		bt(n, depth+1, k);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int k = Integer.parseInt(tmp.split(" ")[1]);
		
		arr = new int[n];
		
		bt(n, 0, k);
		
		System.out.println(sb);
	}
}
