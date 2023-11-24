package Acmicpc.As.S5.TenThousandth.One.Five;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class LineUp11536 {
	static String[] arr = null;
	static boolean check(String[] cArr) {
		int res = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(cArr[i])) {
				res++;
			}
		}
		return res == arr.length;
	}
	static String func() {
		String[] cArr = arr.clone();
		Arrays.sort(cArr, Collections.reverseOrder());
		
		if (check(cArr)) {
			return "DECREASING";
		}
		
		Arrays.sort(cArr);
		
		if (check(cArr)) {
			return "CREASING";
		}
		
		return "NEITHER";
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		arr = new String[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = br.readLine();
		}
		
		System.out.println(func());
		br.close();
	}
}
