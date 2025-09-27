package Acmicpc.As.B4.ThirtyThousandth.Four.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DonutShop34455 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int D = Integer.parseInt(br.readLine()), E = Integer.parseInt(br.readLine()), Q = 0;
		char c = ' ';
		
		while(E-- > 0) {
			c = br.readLine().charAt(0);
			Q = Integer.parseInt(br.readLine());
			D = c == '+' ? D+Q : D-Q;
		}
		
		System.out.println(D);
		br.close();
	}
}
