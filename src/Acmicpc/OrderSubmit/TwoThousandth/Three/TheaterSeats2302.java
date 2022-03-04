package Acmicpc.OrderSubmit.TwoThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TheaterSeats2302 {
	static int[] arr = null;
	static boolean[] check = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine()), cnt = 1, fix = 0;
		arr = new int[N+1];
		check = new boolean[N+2];
		
		Arrays.fill(arr, 1);
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		for (int i = 0; i < M; i++) {
			fix = Integer.parseInt(br.readLine());
			check[fix] = true;
		}
		check[check.length-1] = true;
		
		for (int i = 1, n = 0; i < check.length; i++) {
			if (check[i]) {
				cnt *= arr[n];
				n = 0;
				continue;
			}
			n++;
		}
		System.out.println(cnt);
		br.close();
	}
}
