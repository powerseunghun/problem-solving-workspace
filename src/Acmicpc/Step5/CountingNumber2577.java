package Acmicpc.Step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CountingNumber2577 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine()), B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine()), n = A * B * C;
		int[] count = new int[10];
		Arrays.fill(count, 0);
		
		while (n != 0) {
			count[n % 10]++;
			n /= 10;
		}
		
		for (int el : count) {
			System.out.println(el);
		}
	}
}
