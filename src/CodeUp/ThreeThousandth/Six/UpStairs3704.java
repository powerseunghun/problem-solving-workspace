package CodeUp.ThreeThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class UpStairs3704 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long[] arr = new long[n+1];
		Arrays.fill(arr, 0);
		
		for (int i = 1; i < arr.length; i++) {
			switch(i) {
			case 1:
				arr[i] = 1;
				break;
			case 2:
				arr[i] = 2;
				break;
			case 3:
				arr[i] = 4;
				break;
			}
		}
		for (int i = 4; i < arr.length; i++) {
			arr[i] = (arr[i-1] + arr[i-2] + arr[i-3]) % 1000;
		}
		System.out.println(arr[n]);
	}
}
