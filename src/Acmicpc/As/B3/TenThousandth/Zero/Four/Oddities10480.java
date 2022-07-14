package Acmicpc.As.B3.TenThousandth.Zero.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Oddities10480 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		for (int i = 0, val = 0; i < n; i++) {
			val = Integer.parseInt(br.readLine());
			sb.append(val + " is " + (val%2 == 0 ? "even" : "odd"));
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}                                  
