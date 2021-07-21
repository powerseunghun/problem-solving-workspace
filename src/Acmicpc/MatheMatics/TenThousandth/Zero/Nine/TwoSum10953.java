package Acmicpc.MatheMatics.TenThousandth.Zero.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoSum10953 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0, num1 = 0, num2 = 0; i < T; i++) {
			tmp = br.readLine().replace(",", " ");
			num1 = Integer.parseInt(tmp.split(" ")[0]);
			num2 = Integer.parseInt(tmp.split(" ")[1]);
			sb.append((num1+num2) + "\n");
		}
		System.out.print(sb.toString());
	}
}
