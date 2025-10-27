package Acmicpc.As.B4.ThirtyThousandth.Four.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KingArthurRoundTable34440 {
	static final double p = 3.141592;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double d = Double.parseDouble(br.readLine());
		double w = Double.parseDouble(br.readLine());
		double n = Double.parseDouble(br.readLine());
		
		System.out.println(d*p >= w*n ? "YES" : "NO");
		br.close();
	}
}
