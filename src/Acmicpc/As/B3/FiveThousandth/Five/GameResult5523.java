package Acmicpc.As.B3.FiveThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameResult5523 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = 0, B = 0, T = Integer.parseInt(br.readLine()), R1 = 0, R2 = 0;
		String tmp = null;
		
		while(T-- > 0) {
			tmp = br.readLine();
			A = Integer.parseInt(tmp.split(" ")[0]);
			B = Integer.parseInt(tmp.split(" ")[1]);
			if (A > B) R1++;
			else if(A < B) R2++;
		}
		
		System.out.println(R1 + " " + R2);
		br.close();
	}
}
