package Acmicpc.As.B1.TwoThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Intern2435 {
	static int[] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(str.split(" ")[0]);
		int K = Integer.parseInt(str.split(" ")[1]), res = Integer.MIN_VALUE;
		arr = new int[N+1];

		for (int i = 1; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if (i == 1) continue;
			arr[i] += arr[i-1];
		}
		
		for (int i = K; i < arr.length; i++) {
			res = Math.max(res, arr[i]-arr[i-K]);
		}
		
		System.out.println(res);
		br.close();
	}
}
