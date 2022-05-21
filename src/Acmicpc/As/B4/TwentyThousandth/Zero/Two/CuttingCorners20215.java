package Acmicpc.As.B4.TwentyThousandth.Zero.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CuttingCorners20215 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int w = Integer.parseInt(tmp.split(" ")[0]);
		int h = Integer.parseInt(tmp.split(" ")[1]);
		double d = w + h - Math.sqrt(Math.pow(w, 2) + Math.pow(h, 2));
		
		System.out.printf("%.9f", d);
		br.close();
	}
}
