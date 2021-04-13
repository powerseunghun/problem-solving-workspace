package Acmicpc.Step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxValue2562 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] n = new int[10];
		int max = 0;
		
		for (int i = 1; i < n.length; i++) {
			n[i] = Integer.parseInt(br.readLine());
			if (n[i] > max) max = n[i];
		}
		
		for (int i = 1; i < n.length; i++) {
			if (max == n[i]) {
				System.out.println(n[i]);
				System.out.println(i);
			}
		}
	}
}
