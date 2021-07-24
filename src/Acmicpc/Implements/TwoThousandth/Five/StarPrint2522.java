package Acmicpc.Implements.TwoThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StarPrint2522 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), space = N-1;
		
		for (int i = 0; i < N; i++, space--) {
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int j = N-space; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		space = 1;
		for (int i = 0; i < N-1; i++, space++) {
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int j = N-space; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
