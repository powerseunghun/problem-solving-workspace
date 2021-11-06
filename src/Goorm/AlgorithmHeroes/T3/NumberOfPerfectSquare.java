package Goorm.AlgorithmHeroes.T3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NumberOfPerfectSquare {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), count = 0, n = 1;
		int[] arr = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			if (Math.pow(n, 2) == arr[i]) {
				n++;
				count++;
			}
			else if (Math.pow(n, 2) > arr[i]) continue;
			else {
				while (Math.pow(n, 2) < arr[i]) n++;
				if (Math.pow(n, 2) == arr[i]) {
					count++;
					n++;
				}
			}
		}
		
		System.out.println(count);
		br.close();
	}
}
