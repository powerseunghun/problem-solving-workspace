package Acmicpc.As.B3.ThirtyThousandth.Four.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BlindSpot34922 {
	static final double v = 0.7853981633974483; 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int w = Integer.parseInt(str.split(" ")[0]);
		int h = Integer.parseInt(str.split(" ")[1]);
		int r = Integer.parseInt(br.readLine());

		System.out.println(String.format("%.2f", w*h - v * Math.pow(r, 2)));
		br.close();
	}
}
