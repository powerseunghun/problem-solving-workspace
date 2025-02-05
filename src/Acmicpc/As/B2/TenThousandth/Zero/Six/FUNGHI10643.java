package Acmicpc.As.B2.TenThousandth.Zero.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FUNGHI10643 {
	static final int l = 8;
	static int[] arr = new int[l], res = new int[l];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length/2; j++) {
				res[i] += arr[(i+j)%l];
			}
			max = Math.max(max, res[i]);
		}
		
		System.out.println(max);
		br.close();
	}
}
