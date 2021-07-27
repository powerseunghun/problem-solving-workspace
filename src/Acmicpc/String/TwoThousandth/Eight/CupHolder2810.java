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
				else {
					sb.append("L");
					con = true;
				}
				break;
			}
		}
		for (int i = 0; i < sb.toString().length()-1; i++) {
			seat = sb.toString();
			if (seat.charAt(i) != '*') {
				if (seat.charAt(i-1) == '*') {
					sb.deleteCharAt(i-1);
					i--;
					count++;
				}
				else if (seat.charAt(i+1) == '*') {
					sb.deleteCharAt(i+1);
					count++;
				}
			}
		}
		
		System.out.println(count);
	}
}
