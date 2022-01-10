package Goorm.AlgorithmHeroes.T7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class EnvironmentMouse {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), sum = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			sum += arr[i];
		}
		Arrays.sort(arr);
		for (int el : arr) {
			System.out.print(el + " ");
		}
		System.out.println();
		System.out.println(sum);
		for (int i = 1; i < arr.length; i++) {
			arr[i] += arr[i-1];
		}
		
		for (int el : arr) {
			System.out.print(el + " ");
		}
		
		System.out.println();
		br.close();
		
	}
}
