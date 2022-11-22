package Acmicpc.As.B4.TwentyThousandth.Six.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Большойудой26057 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long L = Long.parseLong(br.readLine());
		long T = Long.parseLong(br.readLine());
		
		System.out.println(T-(L-T));
		br.close();
	}
}
