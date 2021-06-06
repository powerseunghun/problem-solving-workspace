package CodeUp.ThreeThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GetAlphaSequence3450 {
	static int count = 0;
	static char[] array = null;
	static boolean[] visitCheck = null;
	static StringBuilder sb = new StringBuilder();
	static void search(int n, int r, int d) {
		if (d == r) {
			count++;
			for (int i = 0; i < array.length; i++) {
				sb.append(array[i]);
			}
			sb.append("\n");
			return;
		}
		
		for (int i = 0; i < n; i++) {
			if (!visitCheck[i]) {
				visitCheck[i] = true;
				array[d] = (char)(i + 65);
				search(n, r, d+1);
				visitCheck[i] = false;
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int r = Integer.parseInt(tmp.split(" ")[1]);
		
		array = new char[r];
		visitCheck = new boolean[n];
		Arrays.fill(visitCheck, false);
		
		search(n, r, 0);
		
		System.out.println(count);
		System.out.print(sb);
	}
}
