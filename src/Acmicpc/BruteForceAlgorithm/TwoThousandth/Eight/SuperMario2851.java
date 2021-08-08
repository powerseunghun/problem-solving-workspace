package Acmicpc.BruteForceAlgorithm.TwoThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SuperMario2851 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];
		int sum = 0, curDiff = 0, nextDiff = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for (int i = 0; i < arr.length; i++) {
			curDiff = Math.abs(sum-100);
			sum += arr[i];
			nextDiff = Math.abs(sum-100);
			
			if (curDiff < nextDiff) {
				sum -= arr[i];
				break;
			}
		}
		System.out.println(sum);
	}
}
