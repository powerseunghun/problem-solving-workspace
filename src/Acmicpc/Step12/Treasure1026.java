package Acmicpc.Step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Treasure1026 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), sum = 0;
		Integer[] A = new Integer[N], B = new Integer[N];
		String tmp = null;
		
		for (int i = 0; i < 2; i++) {
			tmp = br.readLine();
			switch(i) {
			case 0:
				for (int j = 0; j < N; j++) {
					A[j] = Integer.parseInt(tmp.split(" ")[j]);
				}
				break;
			case 1:
				for (int j = 0; j < N; j++) {
					B[j] = Integer.parseInt(tmp.split(" ")[j]);
				}
				break;
			}
		}
		Arrays.sort(A);
		Arrays.sort(B, Collections.reverseOrder());
		for (int i = 0; i < N; i++) {
			sum += (A[i] * B[i]);
		}
		System.out.println(sum);
	}
}
