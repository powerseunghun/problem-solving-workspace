package Acmicpc.As.B3.ThirtyThousandth.Two.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoinGod32866 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		int X = Integer.parseInt(br.readLine());
		double res = 10000.0/(100.0-X)-100.0;
		
		System.out.println(String.format("%.6f", res));
		br.close();
	}
}
