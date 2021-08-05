package Acmicpc.GreedyAlgorithm.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class ProvideRank2012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long sum = 0, min = Long.MAX_VALUE;
		Integer[] arr = new Integer[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr, Collections.reverseOrder());
		
		for (int i = 0; i < arr.length; i++) {
			sum += Math.abs(arr[i]-(N--));
		}
		min = Math.min(sum, min);
		sum = 0;
		
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			sum += Math.abs(arr[i]-(i+1));
		}
		min = Math.min(sum, min);
		
		System.out.println(min);
	}
}
