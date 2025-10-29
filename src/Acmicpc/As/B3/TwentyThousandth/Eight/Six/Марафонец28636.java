package Acmicpc.As.B3.TwentyThousandth.Eight.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Марафонец28636 {
	static String func(int h, int m, int s) {
		return ((h < 10 ? "0" : "") + h + ":") 
				+ ((m < 10 ? "0" : "") + m + ":") 
				+ ((s < 10 ? "0" : "") + s + "\n");
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), h = 0, m = 0, s = 0;
		String str = null;
		
		while(n-- > 0) {
			str = br.readLine();
			m += Integer.parseInt(str.split(":")[0]);
			s += Integer.parseInt(str.split(":")[1]);
		}
		
		m += s/60;
		s %= 60;
		h += m/60;
		m %= 60;
		
		System.out.print(func(h, m, s));
		br.close();
	}
}
