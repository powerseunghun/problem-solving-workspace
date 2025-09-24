package Acmicpc.As.B4.ThirtyThousandth.Four.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TallEnough34414 {
	static final int l = 48;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), h = 0;
		boolean flag = true;
		
		while(n-- > 0) {
			h = Integer.parseInt(br.readLine());
			if (h < l) flag = false;
		}
		
		System.out.println(flag ? "True" : "False");
		br.close();
	}
}
