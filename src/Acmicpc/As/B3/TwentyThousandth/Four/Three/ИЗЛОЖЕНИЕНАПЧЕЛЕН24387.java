package Acmicpc.As.B3.TwentyThousandth.Four.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ИЗЛОЖЕНИЕНАПЧЕЛЕН24387 {
	static final int l = 3;
	static void init(String str, long[] arr) {
		for (int i = 0; i < str.split(" ").length; i++) {
			arr[i] = Long.parseLong(str.split(" ")[i]);
		}
	}
	static long func(long[] arr1, long[] arr2) {
		return arr1[0]*arr2[0]+arr1[1]*arr2[1]+arr1[2]*arr2[2];
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long[] arr1 = new long[l], arr2 = new long[l];
		init(br.readLine(), arr1);
		init(br.readLine(), arr2);
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		System.out.println(func(arr1, arr2));
		br.close();
	}
}
