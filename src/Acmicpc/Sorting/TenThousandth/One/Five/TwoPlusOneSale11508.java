package Acmicpc.Sorting.TenThousandth.One.Five;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.IOException;

public class TwoPlusOneSale11508 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), sum = 0;
		Integer[] arr = new Integer[N];
		//10 9 6 4 4 3 2
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr, Collections.reverseOrder());
		
		for (int i = 0; i < arr.length; i++) {
			if (i % 3 == 2) continue;
			sum += arr[i];
		}
		System.out.println(sum);
	}
}
