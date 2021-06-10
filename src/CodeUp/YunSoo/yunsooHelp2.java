package CodeUp.YunSoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class yunsooHelp2 {
	static int[] arr = null;
	static void bt(int N, int M, int d, int c) {
		if (d == M) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
		
		for (int i = c; i <= N; i++) {
			arr[d] = i;
			bt(N, M, d+1, i+1);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		arr = new int[M];
		
		bt(N, M, 0, 1);
	}
}
