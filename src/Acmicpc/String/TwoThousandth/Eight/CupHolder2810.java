package Acmicpc.String.TwoThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CupHolder2810 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), count = 0;
		String seat = br.readLine();
		StringBuilder sb = new StringBuilder("*");
		boolean con = false;
		
		for (int i = 0; i < seat.length(); i++) {
			switch(seat.charAt(i)) {
			case 'S':
				sb.append("S*");
				break;
			case 'L':
				if (con) {
					con = false;
					sb.append("L*");
				}
				else con = true;
				break;
			}
		}
		for (int i = 0; i < sb.toString().length(); i++) {
			if (sb.toString().charAt(i) == '*') count++;
		}
		
		System.out.println(count);
	}
}
