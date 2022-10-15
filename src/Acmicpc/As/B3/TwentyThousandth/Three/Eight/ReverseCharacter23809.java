package Acmicpc.As.B3.TwentyThousandth.Three.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseCharacter23809 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N*5; j++) {
				sb.append((j < N || j > N*5-N-1) ? "@" : " ");
			}
			sb.append("\n");
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N*4; j++) {
				sb.append((j < N || j > N*4-N-1) ? "@" : " ");
			}
			sb.append("\n");
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N*3; j++) {
				sb.append("@");
			}
			sb.append("\n");
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N*4; j++) {
				sb.append((j < N || j > N*4-N-1) ? "@" : " ");
			}
			sb.append("\n");
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N*5; j++) {
				sb.append((j < N || j > N*5-N-1) ? "@" : " ");
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
