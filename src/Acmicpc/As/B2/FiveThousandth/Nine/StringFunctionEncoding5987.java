package Acmicpc.As.B2.FiveThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringFunctionEncoding5987 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		int T = Integer.parseInt(br.readLine()), n = 0, c = 0;
		
		while(T-- > 0) {
			str = br.readLine();
			n = Integer.parseInt(str.split(" ")[0]);
			c = Integer.parseInt(str.split(" ")[1]);
			str = str.split(" ")[2];
			
			for (int i = 0; i < c; i++) {
				str = str.substring(n) + str;
			}
			sb.append(str).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
