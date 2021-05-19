package CodeUp.TwoThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ElectionBackTracking2608 {
	static char[] el = null;
	static void bt(int n, int depth) {
		if (depth == n) {
			for (int i = 0; i < n; i++) {
				System.out.print(el[i]);
			}
			System.out.println();
			return;
		}
		el[depth] = 'O';
		bt(n, depth+1);
		el[depth] = 'X';
		bt(n, depth+1);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		el = new char[Integer.parseInt(br.readLine())];
		
		bt(el.length, 0);
	}
}
