package Acmicpc.As.B2.TenThousandth.Seven.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PizzaDivide17946 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		while(N-- > 0) {
			sb.append(br.readLine() != null ? "1" : "").append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
