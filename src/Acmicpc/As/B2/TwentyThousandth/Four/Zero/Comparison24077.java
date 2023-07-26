package Acmicpc.As.B2.TwentyThousandth.Four.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Comparison24077 {
	static final int arrayCnt = 2;
	static int[] arr1 = null, arr2 = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = null;
		int N = Integer.parseInt(str.split(" ")[0]);
		int M = Integer.parseInt(str.split(" ")[1]), res = 0;
		arr1 = new int[N];
		arr2 = new int[M];
		
		for (int i = 0; i < arrayCnt; i++) {
			st = new StringTokenizer(br.readLine());
			if (i == 0) {
				for (int j = 0; j < arr1.length; j++) {
					arr1[j] = Integer.parseInt(st.nextToken());
				}
			}
			else {
				for (int j = 0; j < arr2.length; j++) {
					arr2[j] = Integer.parseInt(st.nextToken());
				}
			}
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] <= arr2[j]) {
					res += arr2.length-j;
					break;
				}
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
