package Acmicpc.As.B3.ThirtyThousandth.Two.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NextMonth32209 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int Q = Integer.parseInt(br.readLine()), x = 0, y = 0, res = 0;
		boolean flag = true;
		String str = null;
		
		while(Q-- > 0) {
			str = br.readLine();
			x = Integer.parseInt(str.split(" ")[0]);
			y = Integer.parseInt(str.split(" ")[1]);
			res = x == 1 ? res+y : res-y;
			if (res < 0) flag = false;
		}
		
		System.out.println(flag ? "See you next month" : "Adios");
		br.close();
	}
}
