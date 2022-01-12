package ProgrammingChallenges.Chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int a = 0, b = 0, maxLength = Integer.MIN_VALUE;
		
		while (true) {
			tmp = br.readLine();
			if (tmp.equals("")) break;
			maxLength = Integer.MIN_VALUE;
			
			a = Integer.parseInt(tmp.split(" ")[0]);
			b = Integer.parseInt(tmp.split(" ")[1]);
			for (int i = a, val = 0, length = 1; i <= b; i++, length = 1) {
				val = i;
				while (val != 1) {
					val = val % 2 == 0 ? val / 2 : (val * 3) + 1;
					length++;
				}
				maxLength = Math.max(length, maxLength);
			}
			System.out.println(a + " " + b + " " + maxLength);
		}
		br.close();
	}
}
