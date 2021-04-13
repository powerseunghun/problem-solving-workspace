package Acmicpc.Step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Modular3052 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		int[] n = new int[42];
		Arrays.fill(n, 0);
		
		for (int i = 0; i < 10; i++) {
			n[Integer.parseInt(br.readLine()) % 42]++;
		}
		for (int i = 0; i < n.length; i++) {
			if (n[i] != 0) count++;
		}
		
		System.out.println(count);
	}
}
