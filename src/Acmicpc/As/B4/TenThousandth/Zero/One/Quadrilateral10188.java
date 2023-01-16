package Acmicpc.As.B4.TenThousandth.Zero.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quadrilateral10188 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), r = 0, c = 0;
		String tmp = null;
		
		while(T-- > 0) {
			tmp = br.readLine();
			c = Integer.parseInt(tmp.split(" ")[0]);
			r = Integer.parseInt(tmp.split(" ")[1]);
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					sb.append("X");
				}
				sb.append("\n");
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
