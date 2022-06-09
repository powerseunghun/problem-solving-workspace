package Acmicpc.As.B3.FiveThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HotDogs5666 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		double a = 0, b = 0;
		String tmp = null;
		
		while ((tmp = br.readLine()) != null) {
			a = Double.parseDouble(tmp.split(" ")[0]);
			b = Double.parseDouble(tmp.split(" ")[1]);
			
			sb.append(String.format("%.2f\n", a/b));
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
