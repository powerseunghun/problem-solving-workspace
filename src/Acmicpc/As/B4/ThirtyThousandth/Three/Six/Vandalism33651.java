package Acmicpc.As.B4.ThirtyThousandth.Three.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vandalism33651 {
	static final String T = "UAPC";
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		for (int i = 0; i < T.length(); i++) {
			if (!str.contains(T.charAt(i)+"")) {
				System.out.print(T.charAt(i));
			}
		}
		
		br.close();
	}
}
