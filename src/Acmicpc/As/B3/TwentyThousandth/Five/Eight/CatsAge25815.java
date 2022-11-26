package Acmicpc.As.B3.TwentyThousandth.Five.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CatsAge25815 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int y = Integer.parseInt(tmp.split(" ")[0]);
		int m = Integer.parseInt(tmp.split(" ")[1]), res = 0;
		if (y == 0) {
			res = m * 15;
		}
		else if (y == 1) {
			res = (15*12) + (m * 9);
		}
		else {
			res = (24*12) + ((y-2)*4*12) + (m*4);
		}
		
		System.out.println((res/12) + " " + (res%12));
		br.close();
	}
}
