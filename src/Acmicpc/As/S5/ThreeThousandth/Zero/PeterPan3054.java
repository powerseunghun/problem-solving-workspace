package Acmicpc.As.S5.ThreeThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PeterPan3054 {
	static final int limit = 5;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		
		for (int i = 0; i < limit; i++) {
			for (int j = 1; j < str.length()+1; j++) {
				if (i == 0 || i == limit-1) {
					sb.append("..").append(j%3 != 0 ? "#" : "*").append(".");
				}
				else if (i == 1 || i == limit-2) {
					char c = j%3 != 0 ? '#' : '*';
					sb.append(".").append(c).append(".").append(c);
				}
				else {
					char c = (j%3 == 0 || (j!=1 && j%3 == 1)) ? '#' : '*';
					sb.append(c).append(".").append(str.charAt(j-1)).append(".");
				}
			}
			if (i != 2) {
				sb.append(".");
			}
			else {
				sb.append(str.length()%3 == 0 ? '*' : '#');
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
