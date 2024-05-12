package Acmicpc.As.B4.ThirtyThousandth.Zero.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrendelFindelMundo30876 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), a = 0, b = 0, x = 0, y = Integer.MAX_VALUE;
		String str = null;
		
		while(N-- > 0) {
			str = br.readLine();
			a = Integer.parseInt(str.split(" ")[0]);
			b = Integer.parseInt(str.split(" ")[1]);
			if (b < y) {
				x = a;
				y = b;
			}
		}
		
		System.out.println(x + " " + y);
		br.close();
	}
}
