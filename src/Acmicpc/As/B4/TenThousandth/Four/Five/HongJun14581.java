package Acmicpc.As.B4.TenThousandth.Four.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HongJun14581 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				sb.append(":");
				sb.append((i==1 && j==1) ? str : "fan");
				sb.append(":");
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
