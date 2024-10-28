package Acmicpc.As.B4.ThirtyThousandth.Zero.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GahuiAndSousenkyo30793 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int px = Integer.parseInt(str.split(" ")[0]);
		int rx = Integer.parseInt(str.split(" ")[1]);
		
		System.out.println(px*10 < rx*2 ?"weak" : px*10 < rx*4 ? "normal" : px*10 < rx*6 ? "strong" : "very strong");
		br.close();
	}
}
