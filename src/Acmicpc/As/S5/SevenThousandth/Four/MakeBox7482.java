package Acmicpc.As.S5.SevenThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakeBox7482 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		double a = 0;
		
		while(T-- > 0) {
			a = Double.parseDouble(br.readLine());
			sb.append(String.format("%.10f", a/6.0)).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
