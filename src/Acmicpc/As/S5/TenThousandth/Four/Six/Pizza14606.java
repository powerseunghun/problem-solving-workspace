package Acmicpc.As.S5.TenThousandth.Four.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pizza14606 {
	static final int limit = 10;
	static int[] arr = new int[limit+1];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		arr[2] = 1;
		for (int i = 3; i < arr.length; i++) {
			arr[i] = arr[i-1] + i-1;
		}
		
		System.out.println(arr[N]);
		br.close();
	}
}
