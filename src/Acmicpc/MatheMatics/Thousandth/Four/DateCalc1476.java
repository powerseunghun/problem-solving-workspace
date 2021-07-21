package Acmicpc.MatheMatics.Thousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DateCalc1476 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int E = Integer.parseInt(tmp.split(" ")[0]);
		int S = Integer.parseInt(tmp.split(" ")[1]);
		int M = Integer.parseInt(tmp.split(" ")[2]);
		
		int e = 1, s = 1, m = 1, year = 1;
	
		while (!(e == E && s == S && m == M)) {
			e++; s++; m++; year++;
			e = e > 15 ? 1 : e;
			s = s > 28 ? 1 : s;
			m = m > 19 ? 1 : m;
		}
		System.out.println(year);
	}
}
