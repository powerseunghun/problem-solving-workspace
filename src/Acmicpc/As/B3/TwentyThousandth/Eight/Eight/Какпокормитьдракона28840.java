package Acmicpc.As.B3.TwentyThousandth.Eight.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Какпокормитьдракона28840 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int h1 = Integer.parseInt(str.split(":")[0]);
		int m1 = Integer.parseInt(str.split(":")[1]);
		str = br.readLine();
		int h2 = Integer.parseInt(str.split(":")[0]);
		int m2 = Integer.parseInt(str.split(":")[1]);
		int t = 1440 - (60*h1+m1) + (60*h2+m2);
		
		System.out.println(String.format("%02d", t/60) + ":" + String.format("%02d", t%60));
		br.close();
	}
}
