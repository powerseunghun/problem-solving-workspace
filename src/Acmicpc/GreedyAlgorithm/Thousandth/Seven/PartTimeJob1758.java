package Acmicpc.GreedyAlgorithm.Thousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class PartTimeJob1758 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), money = 0;
		long sum = 0;
		Integer[] arr = new Integer[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr, Collections.reverseOrder());
		
		for (int i = 0; i < arr.length; i++) {
			money = arr[i] - (i+1-1);
			sum = money > 0 ? sum + money : sum;
		}
		System.out.println(sum);
	}
}
