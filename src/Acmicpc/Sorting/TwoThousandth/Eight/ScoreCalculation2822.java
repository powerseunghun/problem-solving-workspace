package Acmicpc.Sorting.TwoThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ScoreCalculation2822 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer, Integer> map = new HashMap<>();
		StringBuilder sb = new StringBuilder();
		Integer[] sortArr = new Integer[8];
		int[] arr = new int[8];
		int sum = 0;
		
		for (int i = 0, val = 0; i < arr.length; i++) {
			val = Integer.parseInt(br.readLine());
			arr[i] = val;
			sortArr[i] = val;
		}
		Arrays.sort(sortArr, Collections.reverseOrder());
		
		for (int i = 0; i < 5; i++) {
			map.put(sortArr[i], 1);
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				sum += arr[i];
				sb.append((i+1) + " ");
			}
		}
		System.out.println(sum);
		System.out.println(sb.toString());
		
	}
}
