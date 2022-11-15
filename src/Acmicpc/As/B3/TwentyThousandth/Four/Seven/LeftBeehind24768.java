package Acmicpc.As.B3.TwentyThousandth.Four.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeftBeehind24768 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int x = 0, y = 0;
		
		while(true) {
			tmp = br.readLine();
			x = Integer.parseInt(tmp.split(" ")[0]);
			y = Integer.parseInt(tmp.split(" ")[1]);
			if (x == 0 && y == 0) break;
			
			if (x+y == 13) {
				sb.append("Never speak again.\n");
			}
			else if (x == y) {
				sb.append("Undecided.\n");
			}
			else if (x > y) {
				sb.append("To the convention.\n");
			}
			else {
				sb.append("Left beehind.\n");
			}
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
