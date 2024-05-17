package Acmicpc.As.B4.TwentyThousandth.Nine.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Случайсигрой29267 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int n = Integer.parseInt(str.split(" ")[0]);
		int k = Integer.parseInt(str.split(" ")[1]), b = 0, l = 0;
		
		while(n-- > 0) {
			str = br.readLine();
			switch(str) {
			case "save":
				l = b;
				break;
			case "load":
				b = l;
				break;
			case "shoot":
				b--;
				break;
			default:
				b += k;
				break;
			}
			sb.append(b).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
