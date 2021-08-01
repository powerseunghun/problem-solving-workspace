package Acmicpc.DataStructure.TenThousandth.Seven.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stick17608 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), base = 0, count = 1;
		int[] arr = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		base = arr[arr.length-1];
		for (int i = arr.length-2; i >= 0; i--) {
			if (arr[i] > base) {
				count++;
				base = arr[i];
			}
		}
		
		System.out.println(count);
	}
}
