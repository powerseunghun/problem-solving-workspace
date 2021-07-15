package Acmicpc.Step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZeroOneTile1904 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[1000001];
		arr[1] = 1; arr[2] = 2;
		for (int i = 3; i <= N; i++) {
			arr[i] = (arr[i-2] + arr[i-1]) % 15746;
		}
		System.out.println(arr[N]);
	}
}
