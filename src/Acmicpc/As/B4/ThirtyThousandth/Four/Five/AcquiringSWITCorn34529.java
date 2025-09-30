package Acmicpc.As.B4.ThirtyThousandth.Four.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AcquiringSWITCorn34529 {
	static final int l = 3;
	static int[] b = new int[] {100, 50, 20};
	static int[] arr = new int[l];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int res = 0;
		
		for (int i = 0; i < l; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < arr.length; i++) {
			int v = Integer.parseInt(st.nextToken()) / b[i];
			res += v * arr[i];
		}
		System.out.println(res);
		br.close();
	}
}
