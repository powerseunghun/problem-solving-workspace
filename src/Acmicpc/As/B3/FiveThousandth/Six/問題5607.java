package Acmicpc.As.B3.FiveThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 問題5607 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()), val1 = 0, val2 = 0, sum1 = 0, sum2 = 0;
		String tmp = null;
		
		while (T-- > 0) {
			tmp = br.readLine();
			val1 = Integer.parseInt(tmp.split(" ")[0]);
			val2 = Integer.parseInt(tmp.split(" ")[1]);
			if (val1 > val2) sum1 += (val1 + val2);
			else if (val1 < val2) sum2 += (val1 + val2);
			else {
				sum1 += val1;
				sum2 += val2;
			}
		}
		
		System.out.println(sum1 + " " + sum2);
		br.close();
	}
}
