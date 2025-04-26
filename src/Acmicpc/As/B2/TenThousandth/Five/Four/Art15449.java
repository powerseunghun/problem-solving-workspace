package Acmicpc.As.B2.TenThousandth.Five.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Art15449 {
	static final int l = 5;
	static int[] arr = new int[l];
	static boolean check(int a, int b, int c) {
		return a+b>c && b+c>a && c+a>b;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int res = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < l-2; i++) {
			for (int j = i+1; j < l-1; j++)
				for (int k = j+1; k < l; k++) {
					res = check(arr[i], arr[j], arr[k]) ? res+1 : res;
				}
		}
		
		System.out.println(res);
		br.close();
	}
}
