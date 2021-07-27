package Acmicpc.String.TwoThousandth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ContinuousPart2495 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		char base = ' ';
		boolean con = false;
		int count = 1, max = 1;
		
		for (int i = 0; i < 3; i++) {
			tmp = br.readLine();
			con = false;
			count = 1;
			max = 1;
			for (int j = 1; j < tmp.length(); j++) {
				if (tmp.charAt(j) == tmp.charAt(j-1)) {
					if (!con) {
						base = tmp.charAt(j);
						con = true;
						count++;
					}
					else {
						if (tmp.charAt(j) == base) count++;
					}
				}
				else {
					if (con) {
						max = Math.max(count, max);
						con = false;
						count = 1;
						base = ' ';
					}
				}
				max = Math.max(count, max);
			}
			System.out.println(max);
		}
	}
}
