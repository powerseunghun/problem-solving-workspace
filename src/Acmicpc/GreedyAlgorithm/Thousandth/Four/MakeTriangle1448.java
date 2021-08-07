package Acmicpc.GreedyAlgorithm.Thousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class MakeTriangle1448 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), a = 0, b = 0, c = 0, sum = -1;
		Integer[] arr = new Integer[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr, Collections.reverseOrder());
		
		a = arr[0];
		for (int i = 0; i < arr.length-2; i++) {
			a = arr[i];
			for (int j = i+1; j < arr.length-1; j++) {
				b = arr[j];
				c = arr[j+1];
				if (a < (b + c)) {
					sum = a + b + c;
					System.out.println(sum);
					return;
				}
			}
		}
		System.out.println(sum);
	}
}
