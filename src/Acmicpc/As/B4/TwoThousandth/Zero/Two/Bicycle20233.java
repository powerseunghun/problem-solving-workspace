package Acmicpc.As.B4.TwoThousandth.Zero.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bicycle20233 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int res1 = 0, res2 = 0;
		int a = Integer.parseInt(br.readLine());
		int x = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		int T = Integer.parseInt(br.readLine());
		
		res1 = T <= 30 ? a : (T-30) * x * 21 + a;
		res2 = T <= 45 ? b : (T-45) * y * 21 + b;
		
		System.out.println(res1 + " " + res2);
		br.close();
	}
}
