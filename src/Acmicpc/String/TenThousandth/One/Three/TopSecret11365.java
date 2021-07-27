package Acmicpc.String.TenThousandth.One.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TopSecret11365 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = null;
		StringBuilder sb = null;
		
		while (true) {
			s = br.readLine();
			if (s.equals("END")) break;
			sb = new StringBuilder(s);
			
			System.out.println(sb.reverse().toString());
		}
	}
}
