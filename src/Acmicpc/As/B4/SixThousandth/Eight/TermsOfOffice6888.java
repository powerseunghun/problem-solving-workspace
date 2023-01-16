package Acmicpc.As.B4.SixThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TermsOfOffice6888 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int X = Integer.parseInt(br.readLine());
		int Y = Integer.parseInt(br.readLine());
		
		for (int i = X; i <= Y; i+=60) {
			sb.append("All positions change in year " + i + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
