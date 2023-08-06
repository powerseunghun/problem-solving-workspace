package Acmicpc.As.B2.TwentyThousandth.Three.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Driip23627 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		System.out.println(str.length() < 5 || !str.substring(str.length()-5, str.length()).equals("driip") ? "not cute" : "cute" );
		br.close();
	}
}
