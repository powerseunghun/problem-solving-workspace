package Acmicpc.As.B3.TwentyThousandth.Zero.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Elevators20571 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[1]);
		
		System.out.println(N == 1 ? 0 : str.contains("residential") ? (N+4)/5 : str.contains("commercial") ? (N+6)/7 : (N+3)/4);
		br.close();
	}
}
