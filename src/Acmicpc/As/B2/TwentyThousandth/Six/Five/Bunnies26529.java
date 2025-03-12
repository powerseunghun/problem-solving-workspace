package Acmicpc.As.B2.TwentyThousandth.Six.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bunnies26529 {
	static int[] arr = new int[46];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		Arrays.fill(arr, 1);
		
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i-1]+arr[i-2];
		}
		
		while(T-- > 0) {
			sb.append(arr[Integer.parseInt(br.readLine())]).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
