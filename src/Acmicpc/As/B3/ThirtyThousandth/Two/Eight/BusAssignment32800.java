package Acmicpc.As.B3.ThirtyThousandth.Two.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BusAssignment32800 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), res = 0, p = 0, a = 0, b = 0;
		String str = null;
		
		while(n-- > 0) {
			str = br.readLine();
			a = Integer.parseInt(str.split(" ")[0]);
			b = Integer.parseInt(str.split(" ")[1]);
			p += b-a;
			res = Math.max(res, p);
		}
		
		System.out.println(res);
		br.close();
	}
}
