package Acmicpc.As.B3.TwentyThousandth.Five.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TimeAndDate25024 {
	static String check(int n, int x, int y) {
		if (n == 1) {
			if ((x >= 1 && x <= 12) && (y >= 1 && y <= 31)) {
				switch(x) {
				case 1: case 3: case 5: case 7: case 8: case 10: case 12:
					return (y >= 1 && y <= 31) ? "Yes" : "No";
				case 4: case 6: case 9: case 11:
					return (y >= 1 && y <= 30) ? "Yes" : "No";
				default:
					return (y >= 1 && y <= 29) ? "Yes" : "No";
				}
			}
			else return "No";
		}
		else {
			if ((x >= 0 && x <= 23) && (y >=0 && y <= 59)) {
				return "Yes";
			}
			else return "No";
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), x = 0, y = 0;
		String tmp = null;
		
		while (T-- > 0) {
			tmp = br.readLine();
			x = Integer.parseInt(tmp.split(" ")[0]);
			y = Integer.parseInt(tmp.split(" ")[1]);
			sb.append(check(0, x, y) + " " + check(1, x ,y) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
