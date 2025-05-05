package Acmicpc.As.B2.TenThousandth.One.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Triangle11596 {
	static final int a = 3;
	static int[] arr1 = new int[a], arr2 = new int[a];
	static String func() {
		boolean flag = true;
		for (int i = 0; i < a; i++) {
			if (arr1[i] != arr2[i]) flag = false;
		}
		return (flag && (arr1[2]*arr1[2] == arr1[0]*arr1[0]+arr1[1]*arr1[1])) ? "YES" : "NO";
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		for (int i = 0; i < 2; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < a; j++) {
				if (i == 0) {
					arr1[j] = Integer.parseInt(st.nextToken());
				} else {
					arr2[j] = Integer.parseInt(st.nextToken());
				}
			}
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		System.out.println(func());
		br.close();
	}
}
