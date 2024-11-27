package Acmicpc.As.B3.ThirtyThousandth.Two.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DishonestLottery32500 {
	static final int l = 51;
	static int[] arr = new int[l];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		String str = null;
		
		for (int i = 0; i < 10*n; i++) {
			str = br.readLine();
			for (int j = 0, v = 0; j < str.split(" ").length; j++) {
				v = Integer.parseInt(str.split(" ")[j]);
				arr[v]++;
			}
		}
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > n*2) {
				sb.append(i).append(" ");
			}
		}
		
		System.out.println(sb.toString().isEmpty() ? "-1" : sb.toString());
		br.close();
	}
}
