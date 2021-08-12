package Acmicpc.BruteForceAlgorithm.Thousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrophyDisplay1668 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), left = 0, right = 0;
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for (int i = 0, base = 0; i < arr.length; i++) {
			if (arr[i] > base) {
				base = arr[i];
				left++;
			}
		}
		for (int i = arr.length-1, base = 0; i >= 0; i--) {
			if (arr[i] > base) {
				base = arr[i];
				right++;
			}
		}
		System.out.println(left);
		System.out.println(right);
	}
}
