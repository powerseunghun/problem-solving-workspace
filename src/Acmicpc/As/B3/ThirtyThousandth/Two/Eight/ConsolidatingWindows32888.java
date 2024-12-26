package Acmicpc.As.B3.ThirtyThousandth.Two.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsolidatingWindows32888 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		double a = Double.parseDouble(str.split(" ")[0]);
		double b = Double.parseDouble(str.split(" ")[1]);
		
		System.out.println(String.format("%.9f", Math.hypot(a, b)));
		br.close();
	}
}
