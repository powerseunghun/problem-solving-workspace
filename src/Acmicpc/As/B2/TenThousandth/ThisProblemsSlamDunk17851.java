package Acmicpc.As.B2.TenThousandth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ThisProblemsSlamDunk17851 {
	static final int l = 5;
	static int[] arr1 = new int[l], arr2 = new int[l];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int v = 0, res = 0;
		
		for (int i = 0; i < 2; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < l; j++) {
				v = Integer.parseInt(st.nextToken());
				if (i == 0) {
					arr1[j] = v;
				} else {
					arr2[j] = v;
				}
			}
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for (int i = 0; i < l; i++) {
			res += arr1[i] > arr2[i] ? 1 : 0;
		}
		
		System.out.println(res);
		br.close();
	}
}
