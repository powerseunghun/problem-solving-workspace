package Acmicpc.As.B4.TwentyThousandth.Eight.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Плащлевитации28960 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int h = Integer.parseInt(str.split(" ")[0]);
		int l = Integer.parseInt(str.split(" ")[1]);
		int a = Integer.parseInt(str.split(" ")[2]);
		int b = Integer.parseInt(str.split(" ")[3]);
		
		System.out.println((a<=l && b <= h*2 || b<=l && a <= h*2) ? "YES" : "NO");
		br.close();
	}
}
