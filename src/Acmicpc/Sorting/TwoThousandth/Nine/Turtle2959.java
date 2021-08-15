package Acmicpc.Sorting.TwoThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Turtle2959 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer[] arr = new Integer[4];
		int sum = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		sum = arr[0];
		
		Arrays.sort(arr, Collections.reverseOrder());
		sum *= arr[1];
		
		System.out.println(sum);
	}
}
