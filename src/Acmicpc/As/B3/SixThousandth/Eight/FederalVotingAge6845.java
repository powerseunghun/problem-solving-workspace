package Acmicpc.As.B3.SixThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FederalVotingAge6845 {
	static boolean func(int y, int m, int d) {
		if (2007-y > 18) return true;
		else if (2007-y == 18) {
			if (m == 1) return true;
			else {
				if (m == 2) return d <= 27 ? true : false;
				else return false;
			}
		}
		else return false;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()), y = 0, m = 0, d = 0;
		String tmp = null;
		
		while(n-- > 0) {
			tmp = br.readLine();
			y = Integer.parseInt(tmp.split(" ")[0]);
			m = Integer.parseInt(tmp.split(" ")[1]);
			d = Integer.parseInt(tmp.split(" ")[2]);
			sb.append(func(y, m, d) ? "Yes\n" : "No\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
