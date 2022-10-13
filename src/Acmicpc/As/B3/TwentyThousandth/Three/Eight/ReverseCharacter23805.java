package Acmicpc.As.B3.TwentyThousandth.Three.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseCharacter23805 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N*3; j++) {
				sb.append("@");
			}
			for (int j = 0; j < N*2; j++) {
				sb.append(j < N ? " " : "@");
			}
			sb.append("\n");
		}
		
		for (int i = 0; i < N*3; i++) {
			for (int j = 0, w = 0, flag = 0; j < N*5; j++) {
				sb.append(flag == 0 ? "@" : " ");
				w++;
				if (w == N) {
					w = 0;
					flag = flag == 0 ? 1 : 0;
				}
			}
			sb.append("\n");
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N*2; j++) {
				sb.append(j < N ? "@" : " ");
			}
			for (int j = 0; j < N*3; j++) {
				sb.append("@");
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
