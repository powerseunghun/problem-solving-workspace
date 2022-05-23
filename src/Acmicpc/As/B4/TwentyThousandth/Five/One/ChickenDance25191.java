package Acmicpc.As.B4.TwentyThousandth.Five.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChickenDance25191 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), A = 0, B = 0;
		String tmp = br.readLine();
		A = Integer.parseInt(tmp.split(" ")[0]);
		B = Integer.parseInt(tmp.split(" ")[1]);
		
		System.out.println(Math.min(N, (A/2 + B)));
		br.close();
	}
}
