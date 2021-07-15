package Acmicpc.Step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MakeOne1463 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		int[] arr = new int[X+1];
		Arrays.fill(arr, 0);
		
		for (int i = 2; i < arr.length; i++) {
			// 3 minus one
			arr[i] = arr[i-1] + 1;
			if (i % 3 == 0) arr[i] = Math.min(arr[i], arr[i/3] + 1);
			if (i % 2 == 0) arr[i] = Math.min(arr[i], arr[i/2] + 1);
		}
		System.out.println(arr[X]);
	}
}
