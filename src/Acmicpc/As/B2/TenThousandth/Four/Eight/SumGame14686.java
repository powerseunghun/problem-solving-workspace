package Acmicpc.As.B2.TenThousandth.Four.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SumGame14686 {
	static int[] arr1 = null, arr2 = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), K = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr1 = new int[N];
		arr2 = new int[N];
		
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
			if (i > 0) {
				arr1[i] += arr1[i-1];
			}
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
			if (i > 0) {
				arr2[i] += arr2[i-1];
			}
		}
		
		for (int i = 0; i < Math.min(arr1.length, arr2.length); i++) {
			K = arr1[i] == arr2[i] ? (i+1) : K;
		}
		
		System.out.println(K);
		br.close();
	}
}
