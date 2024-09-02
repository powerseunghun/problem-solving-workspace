package Acmicpc.As.B3.TwentyThousandth.Seven.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BlueberryWaffle27566 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int r = Integer.parseInt(str.split(" ")[0]);
		int f = Integer.parseInt(str.split(" ")[1]);
		
		System.out.println(((f+r/2)/r&1) == 0 ? "up" : "down");
		br.close();
	}
}
