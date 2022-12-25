package Acmicpc.As.B4.TwentyThousandth.Six.Seven;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WynikMeczu26736 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int ca = str.replaceAll("B", "").length();
		int cb = str.replaceAll("A", "").length();
		
		System.out.println(ca + " : " + cb);
		br.close();
	}
}
