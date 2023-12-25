package Acmicpc.As.S5.TenThousandth.Eight.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BigNumber18511 {
	static int[] arr = null;
	static int res = Integer.MIN_VALUE;
	static void func(int N, int K, int c) {
		if (c > N) return;
		res = res < c ? c : res;
		for (int i = K-1; i >= 0; i--) {
			func(N, K, c*10+arr[i]);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(str.split(" ")[0]);
		int K = Integer.parseInt(str.split(" ")[1]);
		arr = new int[K];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		func(N, K, 0);
		
		System.out.println(res);
		br.close();
	}
}
