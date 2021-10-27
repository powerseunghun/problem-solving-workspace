package Goorm.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PerfectSquareNumber {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[Integer.parseInt(br.readLine())];
		int value = 1, count = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; ) {
			if (arr[i] == Math.pow(value, 2)) {
				i++;
				value++;
				count++;
			}
			else if (arr[i] > Math.pow(value, 2)) value++;
			else i++;
		}
		System.out.println(count);
	}
}
