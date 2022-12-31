package Acmicpc.As.B4.FiveThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FillTheRowBoats5300 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= N; i++) {
			sb.append(i + " ");
			sb.append((i%6==0||i==N) ? "Go!" : "");
			sb.append(i%6==0 ? " " : "");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
