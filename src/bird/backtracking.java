package bird;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backtracking {
	static void func(int d, int M, int N) {
		// return
		if (d >= M) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
		
		// processing
		for (int i = 0; i < N; i++) {
			if (!visit[i]) {
				visit[i] = true;
				arr[d] = i+1;
				func(d+1, M, N);
				visit[i] = false;
			}
		}
	}
	static boolean[] visit = null;
	static int[] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		arr = new int[M];
		visit = new boolean[N];
		
		func(0, M, N);
		br.close();
	}
}
