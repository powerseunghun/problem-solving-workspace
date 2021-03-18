package Acmicpc.Step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TriangleSequenceDP9461 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine()), N = 0;
		long[] array = new long[100];
		
		array[0] = 1;
		array[1] = 1;
		array[2] = 1;
		for (int i = 3; i < array.length; i++) {
			array[i] = array[i-2] + array[i-3];
		}
		
		for (int i = 0; i < T; i++) {
			N = Integer.parseInt(br.readLine());
			sb.append(array[N-1] + "\n");
		}
		System.out.println(sb);
	}
}
