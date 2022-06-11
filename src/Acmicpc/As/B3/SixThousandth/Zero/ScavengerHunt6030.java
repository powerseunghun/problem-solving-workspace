package Acmicpc.As.B3.SixThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScavengerHunt6030 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = br.readLine();
		int P = Integer.parseInt(tmp.split(" ")[0]);
		int Q = Integer.parseInt(tmp.split(" ")[1]);
		
		for (int i = 1; i <= P; i++) {
			for (int j = 1; j <= Q; j++) {
				if (P % i == 0 && Q % j == 0) {
					sb.append(i + " " + j + "\n");
				}
			}
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
