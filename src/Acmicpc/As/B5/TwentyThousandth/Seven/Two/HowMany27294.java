package Acmicpc.As.B5.TwentyThousandth.Seven.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HowMany27294 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int T = Integer.parseInt(str.split(" ")[0]);
		int S = Integer.parseInt(str.split(" ")[1]);
		 
		System.out.println(((!(T >= 12 && T <= 16)) || S == 1) ? 280 : 320);
		br.close();
	}
}
