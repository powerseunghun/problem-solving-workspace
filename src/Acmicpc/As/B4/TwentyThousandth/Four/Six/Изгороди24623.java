package Acmicpc.As.B4.TwentyThousandth.Four.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Изгороди24623 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		int a = Integer.parseInt(br.readLine());
		
		System.out.println(Math.round((180-a)/2.0+a/2.0));
		br.close();
	}
}
