package Acmicpc.MatheMatics.TwoThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Roof2217 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), max = 0, sum = 0;
		Integer[] arr = new Integer[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr, Collections.reverseOrder());
		
		sum = arr[0];
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]*(i+1));
		}
		System.out.println(max);
	}
}
