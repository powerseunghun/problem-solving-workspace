package Acmicpc.As.B5.ThirtyThousandth.Four.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chaple34045 {
	static final int w = 8;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		
		System.out.println(w-x > 2 ? "Oh My God!" : "Success!");
		br.close();
	}
}
