package Acmicpc.As.B4.ThirtyThousandth.Zero.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Попит30585 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int w = Integer.parseInt(str.split(" ")[0]);
		int h = Integer.parseInt(str.split(" ")[1]), res = 0;
		
		for (int i = 0; i < w; i++) {
			str = br.readLine();
			res += str.length() - str.replace("1", "").length();
		}
		
		System.out.println(Math.min(res, w*h-res));
		br.close();
	}
}
