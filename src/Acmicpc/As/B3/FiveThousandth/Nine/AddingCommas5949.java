package Acmicpc.As.B3.FiveThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddingCommas5949 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String tmp = br.readLine();
		for (int i = tmp.length()-1, w = 0; i >= 0; i--) {
			sb.append(tmp.charAt(i));
			w++;
			if (w < 3 || i == 0) continue;
			sb.append(",");
			w = 0;
		}
		
		System.out.println(sb.reverse().toString());
		br.close();
	}
}
