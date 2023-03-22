package Acmicpc.As.B4.NineThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quadrants9772 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		double X = 0, Y = 0;
		int quad = 0;
		
		while(true) {
			str = br.readLine();
			X = Double.parseDouble(str.split(" ")[0]);
			Y = Double.parseDouble(str.split(" ")[1]);
			if (X > 0 && Y > 0) quad = 1;
			else if (X < 0 && Y > 0) quad = 2;
			else if (X < 0 && Y < 0) quad = 3;
			else if (X > 0 && Y < 0) quad = 4;
			else {
				sb.append("AXIS").append("\n");
				if (X == 0 && Y == 0) break;
				continue;
			}
			sb.append("Q").append(quad).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
