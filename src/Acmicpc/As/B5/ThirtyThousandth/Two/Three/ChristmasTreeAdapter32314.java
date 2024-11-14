package Acmicpc.As.B5.ThirtyThousandth.Two.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChristmasTreeAdapter32314 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int w = Integer.parseInt(str.split(" ")[0]);
		int v = Integer.parseInt(str.split(" ")[1]);
		
		System.out.println(w >= a*v ? "1" : "0");
		br.close();
	}
}
