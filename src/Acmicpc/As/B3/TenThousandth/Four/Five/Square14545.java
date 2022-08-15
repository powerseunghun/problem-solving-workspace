package Acmicpc.As.B3.TenThousandth.Four.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Square14545 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()), r = 0, sum = 0;
		
		while (n-- > 0) {
			sum = 0;
			r = Integer.parseInt(br.readLine());
			for (int i = 1; i <= r; i++) {
				sum += Math.pow(i, 2);
			}
			sb.append(sum + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
