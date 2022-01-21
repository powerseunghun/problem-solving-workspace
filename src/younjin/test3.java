package younjin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class test3 {
	static int[] arr = null;
	static boolean[] check = null;
	static void func(int N, int M, int d, int idx) {
		if (d >= M) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " "); 
			}
			System.out.println();
			return;
		}
		for (int i = idx; i < N; i++) {
			arr[d] = (i+1);
			func(N, M, d+1, i+1);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		arr = new int[M];
		check = new boolean[N];
		
		Arrays.fill(check, false);
		func(N, M, 0, 0);
	}
}
