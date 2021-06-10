package CodeUp.YunSoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class yunsooHelp3 {
	static char[] arr = null;
	static void bt(int n, int depth) {
		if (depth == n) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
		
		arr[depth] = '0';
		bt(n, depth+1);
		arr[depth] = '1';
		bt(n, depth+1);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		arr = new char[n];
		bt(n, 0);
	}
}
