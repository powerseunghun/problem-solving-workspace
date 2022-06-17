package Acmicpc.As.B3.SixThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Floppies6436 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int s = 0;
		
		for (int i = 1; ; i++) {
			s = Integer.parseInt(br.readLine());
			if (s == 0) break;
			s = s % 2 == 0 ? s/2+1 : s/2;
			s += s/2;
			sb.append("File #" + i + "\n");
			sb.append("John needs " + ((s+1860000-1) / 1860000) + " floppies.\n\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
