package Acmicpc.MatheMatics.Thousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SquareNumberSum1699 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N+1];
		for (int i = 1; i < arr.length; i++) {
			arr[i] = i;
		}
		
		for (int i = 2; i < arr.length; i++) {
			for (int j = 2; j*j <= i; j++) {
				arr[i] = Math.min(arr[i], arr[i-j*j]+1);
			}
		}
		System.out.println(arr[N]);
	}
}
