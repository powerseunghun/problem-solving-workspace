package CodeUp.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxMinValue1286 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = -1000001, min = 1000001, tmp = 0;
		for (int i = 0; i < 5; i++) {
			tmp = Integer.parseInt(br.readLine());
			max = tmp >= max ? tmp : max;
			min = tmp <= min ? tmp : min;
		}
		
		System.out.println(max);
		System.out.println(min);
	}
}
