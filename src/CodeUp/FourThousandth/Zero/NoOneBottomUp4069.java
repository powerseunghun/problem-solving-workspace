package CodeUp.FourThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NoOneBottomUp4069 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n+1];
		Arrays.fill(arr, 0);
		
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i-1] + 1;
			if (i % 2 == 0) arr[i] = Math.min(arr[i], arr[i/2] + 1);
			if (i % 5 == 0) arr[i] = Math.min(arr[i], arr[i/5] + 1);
		}
		System.out.println(arr[n]);
	}
}
