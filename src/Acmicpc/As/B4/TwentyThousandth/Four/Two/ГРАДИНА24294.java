package Acmicpc.As.B4.TwentyThousandth.Four.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ГРАДИНА24294 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int w1 = Integer.parseInt(br.readLine());
		int h1 = Integer.parseInt(br.readLine());
		int w2 = Integer.parseInt(br.readLine());
		int h2 = Integer.parseInt(br.readLine());
		
		System.out.println(2 * Math.max(w1, w2) + 2 * (h1 + h2) + 4);
		br.close();
	}
}
