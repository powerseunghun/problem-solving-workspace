package Acmicpc.As.B3.SixThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Golf6437 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int p = 0, s = 0, idx = 1;
		
		while (true) {
			tmp = br.readLine();
			p = Integer.parseInt(tmp.split(" ")[0]);
			s = Integer.parseInt(tmp.split(" ")[1]);
			if (p == 0 && s == 0) break;
			sb.append("Hole #" + (idx++) + "\n");
			
			if (s == 1) {
				sb.append("Hole-in-one.\n\n");
				continue;
			}
			
			switch(Math.abs(p-s)) {
			case 0:
				sb.append("Par.\n");
				break;
			case 1:
				sb.append(p < s ? "Bogey.\n" : "Birdie.\n");
				break;
			case 2:
				sb.append(p < s ? "Double Bogey.\n" : "Eagle.\n");
				break;
			case 3: default:
				sb.append(p < s ? "Double Bogey.\n" : "Double Eagle.\n");
				break;
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
