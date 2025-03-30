package Acmicpc.As.B2.TenThousandth.Zero.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuiteAProblem10491 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		
		while((str=br.readLine()) != null) {
			sb.append(str.toUpperCase().contains("PROBLEM") ? "yes" : "no").append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
