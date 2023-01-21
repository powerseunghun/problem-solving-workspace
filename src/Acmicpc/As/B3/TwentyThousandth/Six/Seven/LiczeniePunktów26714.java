package Acmicpc.As.B3.TwentyThousandth.Six.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LiczeniePunktów26714 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), res = 0;
		String str = br.readLine();
		
		for (int i = 0; i < str.length(); i+=(N/10)) {
			res += str.substring(i, i+N/10).replaceAll("N", "").length() == N/10 ? 1 : 0;
		}
		
		System.out.println(res);
		br.close();
	}
}
