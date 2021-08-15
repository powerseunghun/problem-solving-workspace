package Acmicpc.Sorting.FiveThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Contest5576 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer[] arr1 = new Integer[10];
		Integer[] arr2 = new Integer[10];
		int sum1 = 0, sum2 = 0;
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 10; j++) {
				if (i == 0) arr1[j] = Integer.parseInt(br.readLine());
				else arr2[j] = Integer.parseInt(br.readLine());
			}
		}
		Arrays.sort(arr1, Collections.reverseOrder());
		Arrays.sort(arr2, Collections.reverseOrder());
		
		sum1 = arr1[0] + arr1[1] + arr1[2];
		sum2 = arr2[0] + arr2[1] + arr2[2];
		System.out.println(sum1 + " " + sum2);
	}
}
