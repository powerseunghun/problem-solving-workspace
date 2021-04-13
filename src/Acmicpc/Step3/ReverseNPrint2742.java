package Acmicpc.Step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseNPrint2742 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		for (int i = N; i >= 1; i--) {
			sb.append(i + "\n");
		}
		
		System.out.println(sb);
	}
}
