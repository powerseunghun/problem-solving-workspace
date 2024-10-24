package Acmicpc.As.B4.TwentyThousandth.Nine.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PakirobotManhattanis29823 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = 0, b = 0;
		br.readLine();
		String str = br.readLine();
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			a += (c == 'E' ? 1 : 0) - (c == 'W' ? 1 : 0);
			b += (c == 'N' ? 1 : 0) - (c == 'S' ? 1 : 0);
		}
		
		System.out.println(Math.abs(a)+Math.abs(b));
		br.close();
	}
}
