package Codeforce.OrderSubmit.EightHundred;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BearAndBigBrother {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int a = Integer.parseInt(tmp.split(" ")[0]);
		int b = Integer.parseInt(tmp.split(" ")[1]), year = 0;
		
		while (a <= b) {
			year++;
			a *= 3;
			b *= 2;
		}
		
		System.out.println(year);
		br.close();
	}
}
