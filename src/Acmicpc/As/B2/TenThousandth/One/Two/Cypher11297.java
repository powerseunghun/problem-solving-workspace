package Acmicpc.As.B2.TenThousandth.One.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cypher11297 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); 
		String str = null;
		int a = 0, b = 0, c = 0;
		
		while(true) {
			str = br.readLine();
			a = Integer.parseInt(str.split(" ")[0]);
			b = Integer.parseInt(str.split(" ")[1]);
			c = Integer.parseInt(str.split(" ")[2]);
			if (a == 0 && b == 0 && c == 0) break;
			
			str = br.readLine();
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				System.out.println("ch :: " + ch);
				if (ch < 'a' || ch > 'z') {
					sb.append(ch);
					continue;
				}
				ch = (char)((ch-97+26-((a+b+c)%25+1))%26+97);
				sb.append(ch);
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
