package Acmicpc.As.B4.TwoThousandth.One.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BankTransfer21633 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double k = Double.parseDouble(br.readLine()), res = 0;
		res = k / 100 + 25;
		
		System.out.printf("%.2f\n", Math.min(Math.max(100, res), 2000));
		br.close();
	}
}
