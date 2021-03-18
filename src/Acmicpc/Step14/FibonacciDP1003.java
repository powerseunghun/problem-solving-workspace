package Acmicpc.Step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FibonacciDP1003 {
	static int[] count0 = new int[41];
	static int[] count1 = new int[41];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0;
		
		count0[0] = 1;
		count0[1] = 0;
		count1[0] = 0;
		count1[1] = 1;
		
		for (int i = 2; i < count0.length; i++) {
			count0[i] = count0[i-2] + count0[i-1];
			count1[i] = count1[i-2] + count1[i-1];
		}
		
		for (int i = 0; i < T; i++) {
			N = Integer.parseInt(br.readLine());
			sb.append(count0[N] + " " + count1[N] + "\n");
		}
		
		System.out.println(sb);
	}
}
