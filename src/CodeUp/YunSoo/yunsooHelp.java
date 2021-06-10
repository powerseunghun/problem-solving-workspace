package CodeUp.YunSoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class yunsooHelp {
	static int[] arr = null;
	static boolean[] visitCheck = null;
	static void bt(int N, int depth, int M) {
		if (depth == M) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
		
		for (int i = 0; i < N; i++) {
			arr[depth] = i+1;
			bt(N, depth+1, M);
//			if (!visitCheck[i]) {
//				visitCheck[i] = true;
//				arr[depth] = i+1;
//				bt(N, depth+1, M);
//				visitCheck[i] = false;
//			}
		}
		
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		
		arr = new int[M];
		Arrays.fill(arr, 0);
		visitCheck = new boolean[N];
		Arrays.fill(visitCheck, false);
		bt(N, 0, M);
	}
}
